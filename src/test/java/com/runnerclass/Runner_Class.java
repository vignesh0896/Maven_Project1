package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = Base_Class.driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");
		driver= geturl("https://adactinhotelapp.com/");
		driver= navigateto("https://demo.automationtesting.in/Alerts.html");
		
		
		//driver= navigateBack();
		

//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		
//		enterTheValueOfElement(username, "Manoj1994");
//
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		
//		enterTheValueOfElement(password, "12345678");
//
//		WebElement signInButton = driver.findElement(By.xpath("//input[@name='login']"));
//	
//		clickOnTheElement(signInButton);
//		
//		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
//		dropdown(location, "byvisibletext", "Melbourne");
//		
//		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
//		dropdown(hotels, "byvisibletext", "Hotel Sunshine");
//		
//		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
//		dropdown(roomtype, "byvisibletext", "Double");
//		
//		WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
//		dropdown(numberofrooms, "selectByValue", "2");
//		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10/12/2022");
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("11/12/2022");
//		
//		WebElement adultsperroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
//		dropdown(adultsperroom, "selectByValue","3");
//		
//		WebElement childrenperroom= driver.findElement(By.id("child_room"));
//		dropdown(childrenperroom, "selectByValue", "2");
//		
//		WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
//		clickOnTheElement(search);
//		
//		WebElement selecthotel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
//		clickOnTheElement(selecthotel);
//		
//		isSelected(selecthotel);
//		
//		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
//		clickOnTheElement(continueButton);
//		
//		WebElement alertwithOk = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
//		
//		alertActions(alertwithOk);
//		
		
		




		


	}

}
