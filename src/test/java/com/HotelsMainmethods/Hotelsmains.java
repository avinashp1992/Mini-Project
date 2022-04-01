package com.HotelsMainmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Intialmethods;
import com.HotelBaseclass.confirmbooking;

public class Hotelsmains extends Intialmethods {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = browserLaunch("chrome");
		geturl("http://adactinhotelapp.com/");
		maximize(driver);
		confirmbooking cm = new confirmbooking(driver);
		sendkeys(cm.getInstanceLoginhotels().getUsername1(), "avinashp92");
		sendkeys(cm.getInstanceLoginhotels().getPwd(), "P6W6QO");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\Output\\1.png");
		FileUtils.copyFile(Source, dest);

		click(cm.getInstanceLoginhotels().getLogins());
		singledropdown(cm.getInstanceSearchhotels().getLocations(), "visible", "Melbourne");
		singledropdown(cm.getInstanceSearchhotels().getHotels(), "visible", "Hotel Sunshine");
		singledropdown(cm.getInstanceSearchhotels().getRoomtype(), "index", "3");
		singledropdown(cm.getInstanceSearchhotels().getRoomnumbers(), "index", "4");
		sendkeys(cm.getInstanceSearchhotels().getCheckindate(), "05/03/2022");
		sendkeys(cm.getInstanceSearchhotels().getCheckindate(), "06/03/2022");
		singledropdown(cm.getInstanceSearchhotels().getAdultsroom(), "index", "2");
		click(cm.getInstanceSearchhotels().getSearch());
		click(cm.getInstanceBookhotels().getRadiobtnclk());
		TakesScreenshot trs = (TakesScreenshot) driver;
		File Source1 = trs.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\Output\\2.png");
		FileUtils.copyFile(Source1, dest2);
		click(cm.getInstanceBookhotels().getContinues());
		sendkeys(cm.getInstanceBookhotels().getFirstnames(), "Avinash");
		sendkeys(cm.getInstanceBookhotels().getLastnames(), "P");
		sendkeys(cm.getInstanceBookhotels().getAddresss(), "123 New York City");
		sendkeys(cm.getInstanceBookhotels().getCreditcardno(), "1234567890123145");
		singledropdown(cm.getInstanceBookhotels().getCardtype(), "index", "2");
		singledropdown(cm.getInstanceBookhotels().getExpmonth(), "index", "4");
		singledropdown(cm.getInstanceBookhotels().getExpyear(), "index", "4");
		sendkeys(cm.getInstanceBookhotels().getCcvvno(), "2354");
		click(cm.getInstanceBookhotels().getBooknow());
		TakesScreenshot tres = (TakesScreenshot) driver;
		File Source3 = tres.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\Output\\3.png");
		FileUtils.copyFile(Source3, dest4);
		Thread.sleep(2000);
		click(cm.getInstanceBookhotels().getItinerary());
		click(cm.getInstanceBookhotels().getRadio2());
		click(cm.getInstanceBookhotels().getCancelorder());
		Thread.sleep(2000);
		switchto(driver);
		TakesScreenshot tress = (TakesScreenshot) driver;
		File Source5 = tress.getScreenshotAs(OutputType.FILE);
		File dest6 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\Output\\4.png");
		FileUtils.copyFile(Source5, dest6);

	}

}
