package com.TestNG.Dec_ParallerExecutions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFour {
	@BeforeMethod
    public void beforeMethod()
    {
        System.out.println("In before method TestFour");
    }
     
    @Test
    public void testOne()
    {
        System.out.println("In testOne TestFour");
    }
     
    @Test
    public void testTwo()
    {
        System.out.println("In testTwo TestFour");
    }
     
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("In after method TestFour");
    }


}
