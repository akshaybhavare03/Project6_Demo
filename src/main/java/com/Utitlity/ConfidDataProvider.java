package com.Utitlity;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfidDataProvider {
	Properties pro;
	public ConfidDataProvider() throws Exception {
	String path1="C:\\Users\\Akshay\\eclipse-workspace\\Project6\\Config\\ConfigPropetisFile";
	FileInputStream fis=new FileInputStream(path1);
	pro=new Properties();
	pro.load(fis);
	}
	public String getBaseUrl_1() {
		return pro.getProperty("BaseUrl_1");

	}
	public String getBaseUrl_2() {
		return pro.getProperty("BaseUrl_2");
	}
}
