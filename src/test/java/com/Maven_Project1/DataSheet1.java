package com.Maven_Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSheet1 {
	private static void readalldata() throws IOException {
		File g = new File("C:\\Users\\VIGNESH\\eclipse-workspace\\Maven_Project1\\dtatadriven exel data\\Project1.xlsx");
		FileInputStream zip = new FileInputStream(g);
		 Workbook wb = new XSSFWorkbook(zip);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i <numberOfRows ; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
					else if (cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int datas = (int) numericCellValue;
						System.out.println(datas);
					}
				}
				

			}
	
		}
		
		 
		public static void main(String[] args) throws IOException {
			readalldata();
		}

	

}
