package com.TestNG.Dec_ParallerExecutions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {
	
	@BeforeMethod
    public void beforeMethod()
    {
        System.out.println("In before method TestOne");
    }
     
    @Test
    public void testOne()
    {
        System.out.println("In testOne");
    }
     
    @Test
    public void testTwo()
    {
        System.out.println("In testTwo in TestOne class");
    }
     
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("In after method TestOne");
    }


}
