package com.readDataFromExcel;

import java.io.IOException;

public class CallingMethod extends ExcelApiTest{
	
	 public static void main(String[] args) throws IOException{

		    //Create an object of ReadGuru99ExcelFile class

		   ExcelApiTest objExcelFile = new ExcelApiTest();

		    //String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
		    
		    String filePath = "C:\\Users\\lenavo\\Documents\\";

		    //Call read file method of the class to read data

		    objExcelFile.readExcel(filePath,"sampleData.xlsx","Sheet1");

		    }

}
