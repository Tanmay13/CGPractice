package com.packages.geeksforgeek;

import java.io.*; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook; 

public class CreateCellAtSpecificPosition { 
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{ 
		// Create a workbook instances 
		Workbook wb = new HSSFWorkbook(); 

		OutputStream os = new FileOutputStream("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\GeeksTestData.xlsx"); 

		// Creating a sheet using predefined class provided by Apache POI 
		Sheet sheet = wb.createSheet("Company Prepration"); 

		// Creating a row at specific position 
		// using predefined class provided by Apache POI 

		// Specific row number 
		Row row = sheet.createRow(1); 

		// Specific cell number 
		Cell cell = row.createCell(1); 

		// putting value at specific position 
		cell.setCellValue("Geeks"); 

		// writing the content to Workbook 
		wb.write(os); 

		System.out.println("given cell is created at position (1, 1)"); 
	} 
} 
