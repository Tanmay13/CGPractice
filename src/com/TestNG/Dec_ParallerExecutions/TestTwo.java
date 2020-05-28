package com.TestNG.Dec_ParallerExecutions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTwo {
	@BeforeMethod
    public void beforeMethod()
    {
        System.out.println("In before methodn TestTwo i");
    }
     
    @Test
    public void testOne()
    {
        System.out.println("In testOne TestTwo");
    }
     
    @Test
    public void testTwo()
    {
        System.out.println("In testTwo TestTwo");
    }
     
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("In after method TestTwo");
    }


}
