package com.Maven_Project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataSheet {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\VIGNESH\\OneDrive\\Desktop\\Project1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheets = wb.getSheet("fb");
		Row row = sheets.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

		String stringCellValue2 = wb.getSheet("fb").getRow(0).getCell(1).getStringCellValue();
		System.out.println(stringCellValue2);
		wb.getSheet("fb").createRow(4).createCell(5).setCellValue("Facebook helps you connect and share with the people in your life.");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIGNESH\\eclipse-workspace\\Maven_Project1\\Driver\\chromedriver.exe");
		WebDriver shop = new ChromeDriver();
		shop.get("https://www.facebook.com/");
		shop.manage().window().maximize();
		WebElement email = shop.findElement(By.id("email"));
		email.sendKeys(stringCellValue);
		WebElement password = shop.findElement(By.id("pass"));
		password.sendKeys(stringCellValue2);
	}

}
