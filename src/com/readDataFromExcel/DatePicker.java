package com.readDataFromExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MHADHAVI\\BrowsersPath\\chrome_83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateval = "21-06-2020";
		selectDateByJS(driver, date, dateval);
		
	}
	public static void selectDateByJS(WebDriver driver,WebElement date,String dateval) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0],setAttribute('value','"+dateval+"')", date);
	}
}
	

