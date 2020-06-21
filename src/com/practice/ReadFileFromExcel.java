package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\lenavo\\Documents\\sampleData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Sheet1");
		
		int rowcount = s.getFirstRowNum();
		System.out.println("RowCount is : " + (rowcount+1));
		
		for(int i=0; i<=rowcount;i++) {
			 Row row = s.getRow(i);
			 
			 String name = row.getCell(0).getStringCellValue();
			 System.out.println(name);
			 String name1 = row.getCell(1).getStringCellValue();
			 System.out.println(name1);
			 String name2 = row.getCell(2).getStringCellValue();
			 System.out.println(name2);
			 }
		
		fis.close();

	}

}
