package com.packages.geeksforgeek;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ReadExcelData {

	public void ReadExcel(String FileName, String SheetName) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\GeeksTestData.xlsx");
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet(SheetName);
		HSSFRow row = sheet.getRow(2);
		HSSFCell cell = row.getCell(2);
		String Value = cell.getStringCellValue();
		System.out.println(Value);

		int row1 = sheet.getLastRowNum();
		System.out.println(row1);
		int row2 = row1 + 1;
		System.out.println(row2);

		int Colno = sheet.getRow(row1).getLastCellNum();
		System.out.println(Colno);

		int[][] al = new int[row2][Colno];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < Colno; j++) {

				System.out.println(sheet.getRow(i).getCell(j));

				DataFormatter db = new DataFormatter();
				String Value1 = db.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.println(Value1);
			}

		}

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ReadExcelData obj=new ReadExcelData();
		obj.ReadExcel("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\TestDataSecond.xlsx", "Sheet1");
	}

}
