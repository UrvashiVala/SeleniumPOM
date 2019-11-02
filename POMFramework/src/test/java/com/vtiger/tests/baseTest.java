package com.vtiger.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vtiger.common.CommonFunction;
import com.vtiger.common.config;

public class baseTest {
	
	public WebDriver driver; 
	public static ExtentReports report;
	public static ExtentTest logger; 
	public static String extentReport;
	
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\com\\vtiger\\utility\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(config.url);
	}
	
	public void tierdown()
	{
		driver.quit();
	}
	
	public void createtestReport()
	{
		report=CommonFunction.setupResult();
	}

}
