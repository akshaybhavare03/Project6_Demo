package com.Utitlity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver driver;
public static ExcelDataProvider excel;
public static ConfidDataProvider config;
	
	@BeforeSuite
	public void bs() throws Exception {
		excel=new ExcelDataProvider();
		config=new ConfidDataProvider();
	}
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(config.getBaseUrl_1());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		
	}
	
}
