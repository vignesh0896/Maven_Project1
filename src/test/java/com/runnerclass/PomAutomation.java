package com.runnerclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.Base_Class;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.WomenCartPage;
import com.singletonDesignPattern.PageObjectManager;

public class PomAutomation extends Base_Class {

	public static WebDriver driver = Base_Class.browserLaunch("chrome");

	// public static HomePage hp = new HomePage(driver);

	// public static LoginPage lp = new LoginPage(driver);

	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = geturl("http://automationpractice.com/index.php");

		clickOnTheElement(pom.getHp().getSignInButton());

		String username = readdata("C:\\Users\\VIGNESH\\OneDrive\\Desktop\\Project1.xlsx", 1, 0);

		enterTheValueOfElement(pom.getLp().getUsername(), username);
		String password = readdata("C:\\\\Users\\\\VIGNESH\\\\OneDrive\\\\Desktop\\\\Project1.xlsx", 1, 1);
		enterTheValueOfElement(pom.getLp().getPassword(), password);
		clickOnTheElement(pom.getLp().getSignInbutton());
		clickOnTheElement(pom.getwp().getWomen());
		clickOnTheElement(pom.getwp().getDresses());
		clickOnTheElement(pom.getdp().getDressclick());
		Thread.sleep(4000);
		clickOnTheElement(pom.getdp().getAddtoCart());
		Thread.sleep(4000);
		clickOnTheElement(pom.getmp().getSelectingTheCart());
		clickOnTheElement(pom.getsp().getSummarypage());
		clickOnTheElement(pom .getsp().getAddresspage());
		clickOnTheElement(pom.getsp().getcheckboxclick());
		clickOnTheElement(pom.getsp().getShippingpage());
		clickOnTheElement(pom.getpp().getPaybybankwire());
		clickOnTheElement(pom.getpp().getConfirmMyorder());
	
		
}
}