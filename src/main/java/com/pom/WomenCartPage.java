package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCartPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[3]")
	private WebElement dresses;
	


	public WomenCartPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getWomen() {
		return women;
	}


	public static WebDriver getDriver() {
		return driver;
	}

	

}
