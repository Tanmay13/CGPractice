package com.ReadData;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckExcelAPITest {

	@Test

	public void ExcetResult() throws Exception {

		ExcelAPITest test = new ExcelAPITest("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\TestData.xlsx");

		ExcelAPITest test2 = new ExcelAPITest("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\TestDataSecond.xlsx");

		int ColoumCount = test.GetColumount("Sheet1");
		System.out.println("Sheet2 is coloum is :" + ColoumCount);

		int Rowoloum = test.GetRowount("Sheet1");
		System.out.println("total number of rows:" + Rowoloum);

		int ColoumCount2 = test2.GetColumount("Sheet1");
		System.out.println("Sheet2 is coloum is :" + ColoumCount2);

		int Rowoloum2 = test2.GetRowount("Sheet1");
		System.out.println("total number of rows:" + Rowoloum2);

		String result1 = test.GetCellData("Sheet1", 4, 2);

		String result2 = test2.GetCellData("Sheet1", 1, 4);

		System.out.println(test2.SetCellData("Sheet1", 5, 2, "True"));

		Assert.assertEquals(result1, result2);

		/*
		  //gettcell data using coloum Name;
		  System.out.println("======================================");
		  System.out.println("Gettimg data through coloum Name");
		  System.out.println(test.GetCellData("Sheet1", "UserName", 4));
		  System.out.println(test.GetCellData("Sheet1", "Password", 4));
		  System.out.println(test.GetCellData("Sheet1", "DateCreated", 4));
		  System.out.println(test.GetCellData("Sheet1", "NoofAttemps ", 4));
		  System.out.println(test.GetCellData("Sheet1", "Result", 4));
		  
		  
		  System.out.println("Getting cell Data using  Coloum number");
		  System.out.println(test2.GetCellData("Sheet1", 0, 4));
		  System.out.println(test2.GetCellData("Sheet1", 1, 4));
		  System.out.println(test2.GetCellData("Sheet1", 2, 4));
		  System.out.println(test2.GetCellData("Sheet1", 3, 4));
		  System.out.println(test2.GetCellData("Sheet1", 4, 4));
		 

		
		  System.out.println("========================================");
		  System.out.println("WriteData in Excell Sheet using coloun Number");
		  System.out.println(test.SetCellData("Sheet1", 5,2, "True"));
		 

		// gettcell data using coloum Number;
		
		  System.out.println("Getting cell Data using  Coloum number");
		  System.out.println(test.GetCellData("Sheet1", 0, 2));
		  System.out.println(test.GetCellData("Sheet1", 1, 2));
		  System.out.println(test.GetCellData("Sheet1", 2, 2));
		  System.out.println(test.GetCellData("Sheet1", 3, 2));
		  System.out.println(test.GetCellData("Sheet1", 4, 2));
		 */
	}

}
