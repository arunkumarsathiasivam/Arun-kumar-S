package com.datdriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenArun2 {

	public static void particular() throws IOException   {
		
		File f= new File("C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\ExcelDD\\DemoDataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheetAt = wb.getSheetAt(0);
        Row row = sheetAt.getRow(1);
        Cell cell = row.getCell(1);
        CellType cType = cell.getCellType();
        if(cType.equals(CellType.STRING)) {
        	String stringCellValue = cell.getStringCellValue();
        	System.out.println(stringCellValue);
        	}
        else if(cType.equals(CellType.NUMERIC)) {
        	double numericCellValue = cell.getNumericCellValue();
        	int value = (int) numericCellValue;
        	System.out.println(value);
        	}
	}
   
	 public static void allData() throws IOException {
	    	File f= new File("C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\ExcelDD\\DemoDataDriven.xlsx");
			FileInputStream fis = new FileInputStream(f);
	        Workbook wb = new XSSFWorkbook(fis);
	        Sheet sheetAt = wb.getSheet("Sheet1");
	        int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	        for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
			Cell cell = row.getCell(j);
			
			CellType cType = cell.getCellType();
		        if(cType.equals(CellType.STRING)) {
		        	String stringCellValue = cell.getStringCellValue();
		        	System.out.println(stringCellValue);
		        	}
		        else if(cType.equals(CellType.NUMERIC)) {
		        	double numericCellValue = cell.getNumericCellValue();
		        	int value = (int) numericCellValue;
		        	System.out.println(value);
		        	}
			
            }
	        } 
	       
	}
	
    public static void main(String[] args) throws IOException {
//   allData();
     particular();
    }
}







	    
      
	    	
	        
		
	


