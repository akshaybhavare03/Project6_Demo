package com.Utitlity;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
	
	public static ExtentTest test;
	
	public static void custome_Senkyes(WebElement element,String value,String fieldname) {
		
		try {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname+"Value sucessfully send ="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
//			System.out.println(e.getMessage());
		}
	}
	
	public static void custome_Click(WebElement element, String fieldname) {
		try {
			test.log(Status.PASS, "Clicked sucessfully..."+fieldname);	
		element.click();
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
//			System.out.println(e.getMessage());
		}
	}
	
	public static void custume_HandaleDroDown(WebElement element,String text) {
		try {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custome_MouseMovment(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public static void custome_GetCapcher(WebDriver driver) throws Exception {
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		String rm=RandomString.make(4);
//		Date d=new Date();
//		d.getDate();
		File destn=new File("C:\\Users\\Akshay\\eclipse-workspace\\Project6\\ScreenShote\\"+rm+".png");
		FileUtils.copyFile(scr, destn);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Alert custome_HandaleAlert(WebDriver driver) {
		try {
		Alert alt=driver.switchTo().alert();
		return alt;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}
}

