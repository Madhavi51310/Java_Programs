package com.readDataFromExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	 public static void main(String args[]) throws Exception
	    {
	        FileInputStream fis = new FileInputStream("C:\\Users\\lenavo\\Documents\\sampleData.xlsx");
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("Sheet1");
	        
	        XSSFRow row = sheet.getRow(1);
	        XSSFCell cell = row.getCell(0);
	 
	        String cellValue = String.valueOf(cell.getNumericCellValue());
	        System.out.println("Value from the Excel sheet :"+ cellValue);
	    }
	}


