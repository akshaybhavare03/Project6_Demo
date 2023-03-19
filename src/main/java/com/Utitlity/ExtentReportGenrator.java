package com.Utitlity;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	// ExtentSparkReporter ---> Doc/Report/Theme/ dising
	// ExtentReports ---> decorative
	
	public static ExtentReports extent;
	public static ExtentReports getreports() {
		String path="C:\\Users\\Akshay\\eclipse-workspace\\Project6\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);	
		reporter.config().setDocumentTitle("Autometion test Reporte");
		reporter.config().setDocumentTitle("Project_6");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Project_6_Demo_Project");
		extent.setSystemInfo("Module Name", "abc Module");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("Version of Selenium", "3.414.59");
		extent.setSystemInfo("QA", "ABC");
		
		return extent;
	}
	
	
}
