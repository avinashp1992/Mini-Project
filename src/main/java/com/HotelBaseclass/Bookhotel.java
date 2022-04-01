package com.HotelBaseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobtnclk() {
		return radiobtnclk;
	}

	public WebElement getContinues() {
		return continues;
	}

	public WebElement getFirstnames() {
		return firstnames;
	}

	public WebElement getLastnames() {
		return lastnames;
	}

	public WebElement getAddresss() {
		return addresss;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCcvvno() {
		return ccvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getCancels() {
		return cancels;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobtnclk;

	@FindBy(id = "continue")
	private WebElement continues;

	@FindBy(id = "first_name")
	private WebElement firstnames;

	@FindBy(id = "last_name")
	private WebElement lastnames;

	@FindBy(id = "address")
	private WebElement addresss;

	@FindBy(id = "cc_num")
	private WebElement creditcardno;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvvno;

	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(id = "cancel")
	private WebElement cancels;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement itinerary;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement radio2;

	@FindBy(name="cancelall")
	private WebElement cancelorder;

	public WebElement getCancelorder() {
		return cancelorder;
	}

	public WebElement getRadio2() {
		return radio2;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public Bookhotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
