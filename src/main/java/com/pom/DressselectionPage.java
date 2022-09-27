package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressselectionPage {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='right-block']/h5/a)[1]")
	private WebElement dressclick;
	
	@FindBy(xpath ="//div[@class='box-info-product']//div/p/button/span")
	private WebElement addtoCart;
	
	

	public DressselectionPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getDressclick() {
		return dressclick;
	}

	public WebElement getAddtoCart() {
		return addtoCart;
	}



	


}
