package com.TestNG.Dec.Groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestByGroups {
	
	 @Test(groups = {"sanity-group"})
	    public void testOne()
	    {
	        System.out.println("This test belongs to sanity-group");
	    }
	     
	    @Test(groups = {"sanity-group","regression-group"})
	    public void testTwo()
	    {
	        System.out.println("This test belongs to sanity-group and regression-group");
	    }
	     
	    @Test(groups = {"regression-group"})
	    public void testThree()
	    {
	        System.out.println("This test belongs to regression-group");
	    }

}
