package com.ReadData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPITest {

	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell Cell = null;
	String xlfilepath = null;

	public ExcelAPITest(String xlfilepath) throws Exception {

		this.xlfilepath = xlfilepath;
		fis = new FileInputStream(xlfilepath);
		wb = new XSSFWorkbook(fis);
		fis.close();
	}

	public int GetRowount(String Sheetname) {
		sheet = wb.getSheet(Sheetname);
		int rowcount = sheet.getLastRowNum() + 1;

		return rowcount;

	}

	public int GetColumount(String Sheetname) {

		sheet = wb.getSheet(Sheetname);
		row = sheet.getRow(0);
		int rowcount = row.getLastCellNum();
		return rowcount;

	}

	public String GetCellData(String Sheetname, int colName, int rowName) {
		try {
			sheet = wb.getSheet(Sheetname);
			row = sheet.getRow(rowName);
			Cell = row.getCell(colName);
			if (Cell.getCellTypeEnum() == CellType.STRING)
				return Cell.getStringCellValue();
			else if (Cell.getCellTypeEnum() == CellType.NUMERIC || Cell.getCellType() == CellType.FORMULA) {
				String Cellvalue = String.valueOf(Cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(Cell)) {
					DateFormat df = new SimpleDateFormat("dd/mm/yy");
					Date date = Cell.getDateCellValue();
					Cellvalue = df.format(date);

				}
				return Cellvalue;

			} else if (Cell.getCellTypeEnum() == CellType.BLANK)
				return "";
			else
				return String.valueOf(Cell.getBooleanCellValue());

		}

		catch (Exception e) {

			e.printStackTrace();

			return "Row" + rowName + "colume" + colName + "dose not exit in excel";
		}

	}

	public String GetCellData(String Sheetname, String colName, int rowName) {
		try

		{
			int colNum = -1;
			sheet = wb.getSheet(Sheetname);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {

				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {

					colNum = i;
				}
			}

			row = sheet.getRow(rowName);
			Cell = row.getCell(colNum);

			if (Cell.getCellTypeEnum() == CellType.STRING)
				return Cell.getStringCellValue();
			else if (Cell.getCellTypeEnum() == CellType.NUMERIC || Cell.getCellType() == CellType.FORMULA) {
				String Cellvalue = String.valueOf(Cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(Cell)) {
					DateFormat df = new SimpleDateFormat("dd/mm/yy");
					Date date = Cell.getDateCellValue();
					Cellvalue = df.format(date);

				}
				return Cellvalue;

			} else if (Cell.getCellTypeEnum() == CellType.BLANK)
				return "";
			else
				return String.valueOf(Cell.getBooleanCellValue());

		} catch (Exception e) {
			e.printStackTrace();
			return "Row" + rowName + "colume" + colName + "dose not exit in excel";

		}

	}

	public boolean SetCellData(String Sheetname, int colName, int rowName, String value) {

		try {
			sheet = wb.getSheet(Sheetname);
			row = sheet.getRow(rowName);
			if (row == null) {
				row = sheet.createRow(rowName);

			}
			Cell = row.getCell(colName);

			if (Cell == null) {
				Cell = row.createCell(colName);

			}
			Cell.setCellValue(value);
			fos = new FileOutputStream(xlfilepath);
			wb.write(fos);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

		return true;

	}
}

/*
 * public boolean SetCellData(String Sheetname, String colName, int
 * rowName,String value) { try { int colNum=-1; sheet=wb.getSheet(Sheetname);
 * row=sheet.getRow(0); for(int i=0;i<row.getLastCellNum();i++) {
 * if(row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
 * colNum=i;
 * 
 * }
 * 
 * 
 * }
 * 
 * row=sheet.getRow(rowName); if(row==null) { row=sheet.createRow(rowName);
 * 
 * } Cell=row.getCell(colName);
 * 
 * if(Cell==null) { Cell=row.createCell(colName);
 * 
 * } Cell.setCellValue(value); fos=new FileOutputStream(xlfilepath);
 * wb.write(fos); fos.close();
 * 
 * 
 * 
 * 
 * 
 * } catch(Exception e) { e.printStackTrace(); return false;
 * 
 * }
 * 
 * 
 * 
 * } }
 */
