package com.ReadData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelRead {
	
	public static void main(String[] args) throws Exception {
		
	
	
	FileInputStream fis=new FileInputStream("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\TestData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet2");
	String xx=wb.getPrintArea(0);
	System.out.println(xx);
	XSSFRow rw=sheet.getRow(0);

	int colcount=rw.getLastCellNum();
	System.out.println("Total number of coloum is :"+colcount);
	int rowcount=sheet.getLastRowNum()+1;
	System.out.println("Totle number of rows in Exelsheet:"+rowcount);
	
	

}
}