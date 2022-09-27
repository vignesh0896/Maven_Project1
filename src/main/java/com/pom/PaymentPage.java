package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	public WebElement paybybankwire;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement confirmMyorder;
	

	public PaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPaybybankwire() {
		return paybybankwire;
	}

	public WebElement getConfirmMyorder() {
		return confirmMyorder;
	}

}
