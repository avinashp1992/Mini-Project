package com.HotelBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginhotel {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username1;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "login")
	private WebElement logins;

	public WebElement getUsername1() {
		return username1;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogins() {
		return logins;
	}

	public loginhotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
