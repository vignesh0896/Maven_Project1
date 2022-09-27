package com.singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.DressselectionPage;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.MoveToCartPage;
import com.pom.PaymentPage;
import com.pom.ShippingPage;
import com.pom.WomenCartPage;

public class PageObjectManager {
	public static WebDriver driver;
	private HomePage hp;
	private LoginPage lp;
	private WomenCartPage wp;
	private DressselectionPage dp;
	private MoveToCartPage mp;
	private ShippingPage sp;
	private PaymentPage pp;
	

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public WomenCartPage getwp() {
		wp=new WomenCartPage(driver);
		return wp;
	}
	public DressselectionPage getdp() {
		dp=new DressselectionPage(driver);
		return dp;
	}
	public MoveToCartPage getmp() {
		mp=new MoveToCartPage(driver);
		return mp;
	}
	public ShippingPage getsp() {
		sp=new ShippingPage(driver);
		return sp;
	}
	public PaymentPage getpp() {
		pp=new PaymentPage(driver);
		return pp;
	}
}
