package com.HotelBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotel {
	
	public static WebDriver driver;
	
	

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocations() {
		return locations;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumbers() {
		return roomnumbers;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getChildernperroom() {
		return childernperroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(id = "location")
	private WebElement locations;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnumbers;
	
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;
	
	@FindBy(id = "adult_room")
	private WebElement adultsroom;
	
	@FindBy(id = "child_room")
	private WebElement childernperroom;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public searchhotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
