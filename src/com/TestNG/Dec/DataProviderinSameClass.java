package com.TestNG.Dec;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderinSameClass {
	
	@Test(dataProvider="Tanmay_Data")
	public void GettingData(String DataProvider,String  DABA)
	{
		
		
		System.out.println("The Data Is comming From Data Provider:"+DataProvider);
		System.out.println("The Data Is comming From Data Provider:"+DABA);
	}
	
	@DataProvider(name="Tanmay_Data")
	
	public Object[][] GetData()
	{
		
		Object[][] O=new Object[2][2];
		{
		O[0][0]="Tanmay";
		O[0][1]="Sujay";
		
		O[1][0]="Anal";
		O[1][1]="Malpe";
		return O;
		
		
		
				
		}
		
		
		
	}
	

}
