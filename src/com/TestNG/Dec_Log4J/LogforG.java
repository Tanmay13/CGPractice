package com.TestNG.Dec_Log4J;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogforG {
	
	
		static Logger logger=Logger.getLogger(LogforG.class);
		public WebDriver driver;
	  @Test(priority=1)
	  public void loginwithValidds()
	  {
		  PropertyConfigurator.configure("C:\\Users\\user\\workspace1\\MercuryTestLog4jMaven\\src\\test\\resources\\log4j.properties");
		  System.out.println("In loginwithValidds method under @Test");
		  logger.warn("Enter valid username");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sunila1");
		  logger.warn("Enter valid password");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("p@ssword1");
		  driver.findElement(By.xpath("//input[@name='login']")).click();
		  driver.findElement(By.linkText("SIGN-OFF")).clear();
	  }
	  @BeforeMethod
	  public void getAllCookies()
	  {
		  System.out.println("In getAllCookies method under @BeforeMethod");
		 Set<Cookie>cookies= driver.manage().getCookies();
		 for(Cookie cookie:cookies)
		 {
			 System.out.println("Cookie name is:"+ cookie.getName());
			 logger.info("cookies get");
		 }
	  }

	  @AfterMethod
	  public void captureScreenshot() throws IOException 
	  {
		  System.out.println("In captureScreenshot method under @AfterMethod");
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFileToDirectory(src, new File("C:\\Users\\TANMAY\\Selenium\\ApachePOI\\Apache_Poi_ScreenShots"));
		  logger.info("screenshot taken successfully");
	  }

	  @BeforeClass
	  public void maximizeBrowser()
	  {
		  System.out.println("In maximizeBrowser method under @BeforeClass");
		  driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void deleteAllCookies()
	  {
		  System.out.println("In deleteAllCookies method under @AfterClass");
		  driver.manage().deleteAllCookies();
	  }

	  @BeforeTest
	  public void getApplicationURL()
	  {
		  System.out.println("In getApplicationURL method under @BeforeTest");
		  driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		  logger.info("URL is open successfully");
	  }

	  @AfterTest
	  public void db_connectionClosed()
	  {
		  System.out.println("In db_connectionClosed method under @AfterTest");
		  logger.warn("db coonection need to closed");
	  }

	  @BeforeSuite
	  public void openBrowser() 
	  {
		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\TANMAY\\Downloads\\Assigement1-10\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  logger.info("openBrowser successfully");
	  }

	  @AfterSuite
	  public void closedBrowser()
	  {
		  System.out.println("In closedBrowser method under @AfterSuite ");
		  driver.close();
		  logger.info("browser closed successfully");
	  }

}

