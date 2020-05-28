package com.tableHandling;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TANMAY\\Downloads\\Assigement1-10\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
	List<WebElement>ls=	driver.findElements(By.xpath("//div[@class='ui-grid-canvas']/div/div/*"));
         int count=	ls.size();
		System.out.println(count);
		
		for(WebElement we:ls)
		{
			String result=we.getText();
			System.out.println(result);
			
		}
	}

}
