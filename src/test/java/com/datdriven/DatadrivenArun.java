package com.datdriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.sun.rowset.internal.Row;

public class DatadrivenArun {
	
	 public static void main(String[]  args) throws IOException, InterruptedException {
			
		 File f = new File("\"C:\\Users\\LENOVO\\eclipse-workspace\\MiniProjectArun\\ArunExcel.xlsx\"");
		 FileInputStream fs = new FileInputStream(f);
		 Workbook wk = new XSSFWorkbook(fs);
		 Sheet sheet = wk.getSheet("Sheet1");
		 
		 int lastRowNum = sheet.getLastRowNum();
		 for (int i = 1; i <= lastRowNum; i++) {
			 
			 List<Object> all = new ArrayList<Object>();
			 
			 Row row1 = sheet.getRow(i);
			 short lastCellNum = row1.getLastCellNum();
			 for (int j = 0; j < lastCellNum; j++) {
				 
				 Cell cell1 = row1.getCell(j);
				 
			 }
		 }
		
}
