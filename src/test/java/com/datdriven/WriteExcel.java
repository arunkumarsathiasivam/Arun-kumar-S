package com.datdriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void allData() throws IOException {
		
	
    	File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\ExcelDD\\WriteTask.xlsx");
		FileInputStream fis = new FileInputStream(f);
        Workbook wb = new XSSFWorkbook(fis);
        
       // wb.createSheet("Sheet1").createRow(0).createCell(0).setCellValue("EMP ID");
        wb.getSheet("Sheet1").getRow(0).createCell(1).setCellValue("DEPT");
        wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("001");	
        wb.getSheet("Sheet1").createRow(2).createCell(0).setCellValue("002");
        wb.getSheet("Sheet1").getRow(1).createCell(1).setCellValue("GSD");
        wb.getSheet("Sheet1").getRow(2).createCell(1).setCellValue("Admin");
        
        FileOutputStream fos = new FileOutputStream(f);
        wb.write(fos);
        
        System.out.println("Done");
    }
}
