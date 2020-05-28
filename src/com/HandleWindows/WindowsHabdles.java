package com.HandleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHabdles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TANMAY\\Downloads\\Assigement1-10\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");

		System.out.println("The Title of Pages is:" + driver.getTitle());
		WebElement Button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Button.click();
		Thread.sleep(5000);
		System.out.println("Title of current page is"+driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itre = windows.iterator();
		String MainWindows = itre.next();
		String Tabwindow = itre.next();
		driver.switchTo().window(Tabwindow);
		System.out.println("Title of page is:" + driver.getTitle());
		driver.switchTo().defaultContent();
		System.out.println("The title of current of pages:" + driver.getTitle());

	}

}
