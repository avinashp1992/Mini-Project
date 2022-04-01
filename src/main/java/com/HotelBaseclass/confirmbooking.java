package com.HotelBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class confirmbooking {

	public static WebDriver driver;

	private loginhotel loginhotels;
	private searchhotel searchhotels;
	private Bookhotel bookhotels;

	public loginhotel getInstanceLoginhotels() {
		loginhotels = new loginhotel(driver);
		return loginhotels;
	}

	public searchhotel getInstanceSearchhotels() {
		searchhotels = new searchhotel(driver);
		return searchhotels;
	}

	public Bookhotel getInstanceBookhotels() {
		bookhotels = new Bookhotel(driver);
		return bookhotels;
	}
	public confirmbooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
