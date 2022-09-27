package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//p[@class='cart_navigation clearfix']/a)[1]")
	private WebElement summarypage;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/button/span")
	private WebElement addresspage;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkboxclick;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/button/span")
	private WebElement shippingpage;
	
	


	public ShippingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummarypage() {
		return summarypage;
	}

	public WebElement getAddresspage() {
		return addresspage;
	}
	
	public WebElement getcheckboxclick() {
		return checkboxclick;
	}

	public WebElement getShippingpage() {
		return shippingpage;
	}

}
