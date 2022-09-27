package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveToCartPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//div[@class='button-container']//a)[1]")
	private WebElement selectingTheCart;

	public MoveToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectingTheCart() {
		return selectingTheCart;
	}
	

}
