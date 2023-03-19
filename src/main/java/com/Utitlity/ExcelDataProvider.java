package com.Utitlity;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String path="C:\\Users\\Akshay\\eclipse-workspace\\Project6\\TestData\\ExcelData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		
	}
	public String getStringdata(String name,int row,int cell) {
		return wb.getSheet(name).getRow(row).getCell(cell).getStringCellValue();
	}
	
}
