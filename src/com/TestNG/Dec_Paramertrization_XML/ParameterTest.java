package com.TestNG.Dec_Paramertrization_XML;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest{
	
	@Parameters({ "suite-level-param" })
    @Test
    public void prameterTestOne(String param)
    {
        System.out.println("Test one suite param is: " + param);
    }
     
    /**
    * Following method takes one parameter as input.
    * Value of the said parameter is defined at test level.
    */
    @Parameters({ "test-level-param" })
    @Test
    public void prameterTestTwo(String param)
    {
        System.out.println("Test two param is: " + param);
    }
     
    /**
    * Following method takes two parameters as input.
    * Value of the test parameter is defined at test level.
    * The suite level parameter is overridden at the test level.
    */
    @Parameters({ "suite-level-param", "test-three-param" })
    @Test
    public void prameterTestThree(String paramOne,    String paramTwo)
    {
        System.out.println("Test three suite param is: " + paramOne);
        System.out.println("Test three param is: " + paramTwo);
    }
	

}
