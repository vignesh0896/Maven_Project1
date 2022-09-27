package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

public class Base_Class {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browserLaunch(String launch) {

		if (launch.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver geturl(String url) {
		driver.get(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		return driver;

	}

	public static WebDriver navigateto(String value) {
		driver.navigate().to(value);
		return driver;

	}

	public static WebDriver navigateBack() {
		driver.navigate().back();
		return driver;

	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
			List<WebElement> alloptions = s.getOptions();
			for (WebElement options : alloptions) {
				System.out.println(options.getText());

			}
			boolean multiple = s.isMultiple();
			System.out.println("ismultiple :" + multiple);

		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
			List<WebElement> alloptions = s.getOptions();
			for (WebElement options : alloptions) {
				System.out.println(options.getText());

			}

			boolean multiple = s.isMultiple();
			System.out.println("ismultiple :" + multiple);
		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
			List<WebElement> alloptions = s.getOptions();
			for (WebElement options : alloptions) {
				System.out.println(options.getText());

			}

			boolean multiple = s.isMultiple();
			System.out.println("IsMultiple :" + multiple);
		}

	}

	public static void clickOnTheElement(WebElement element) {

		element.click();
	}

	public static void enterTheValueOfElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void movetoelement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("Is selected :" + selected);

	}

	public static String readdata(String path, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);

		}
		return value;

	}

	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	public static void close() {
		driver.close();

	}

	public static WebDriver alertActions(WebElement element) {
		Actions d = new Actions(driver);
		if (element.equals(d)) {
			WebElement alertclick = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
			element.click();

		}
		return driver;

	}

}
