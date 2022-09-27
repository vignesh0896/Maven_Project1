package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;

	@FindBy(id = "email")

	private WebElement username;

	@FindBy(id = "passwd")

	private WebElement password;

	@FindBy(id = "SubmitLogin")

	private WebElement SignInbutton;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInbutton() {
		return SignInbutton;
	}

}
