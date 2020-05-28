package com.TestNG.Dec_ParallerExecutions;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParalleExecutions {
	
	 @BeforeMethod
	    public void beforeMethod()
	    {
	        System.out.println("In before method");
	    }
	     
	    @Test
	    public void testOne()
	    {
	        System.out.println("In testOne");
	    }
	     
	    @Test
	    public void testTwo()
	    {
	        System.out.println("In testTwo");
	    }
	     
	    @AfterMethod
	    public void afterMethod()
	    {
	        System.out.println("In after method");
	    }

}
