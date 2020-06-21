package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadData {

public static void main(String[] args) {
	

		File file = new File("C:\\Users\\lenavo\\Documents\\sampleData.xlsx");
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		
		try{
			
			FileInputStream excel = new FileInputStream(file);
			workbook = new XSSFWorkbook(excel);
			sheet = workbook.getSheet("Sheet1");
			
			int start = sheet.getFirstRowNum();
			
			int end = sheet.getLastRowNum();
			
			for(int i = start; i<=end ; i++) {
				
				System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + "\t");
				System.out.println(sheet.getRow(i).getCell(1).getStringCellValue() + "\t");
				System.out.println(sheet.getRow(i).getCell(2).getStringCellValue() + "\t");
				//System.out.println(sheet.getRow(i).getCell(3).getStringCellValue() + "\t");
			}
}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
}
	}


