package com.ReaderHotelmain;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Intialmethods;
import com.HotelBaseclass.confirmbooking;
import com.Reader.FileReader;

public class ReaderHotelsmain extends Intialmethods {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = browserLaunch("chrome");
		
		//USING CONFIGURATION READER
		geturl(FileReader.getInstanceFR().getInstanceCR().getUrl());
		maximize(driver);
		confirmbooking cm = new confirmbooking(driver);
		String username = FileReader.getInstanceFR().getInstanceCR().getUsername();
		sendkeys(cm.getInstanceLoginhotels().getUsername1(), username);
		String password = FileReader.getInstanceFR().getInstanceCR().getPassword();
		sendkeys(cm.getInstanceLoginhotels().getPwd(), password);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source1 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\1.png");
		FileUtils.copyFile(Source1, dest2);
		click(cm.getInstanceLoginhotels().getLogins());
		//*************************

		singledropdown(cm.getInstanceSearchhotels().getLocations(), "visible", "Melbourne");
		singledropdown(cm.getInstanceSearchhotels().getHotels(), "visible", "Hotel Sunshine");
		singledropdown(cm.getInstanceSearchhotels().getRoomtype(), "index", "3");
		singledropdown(cm.getInstanceSearchhotels().getRoomnumbers(), "index", "4");
		sendkeys(cm.getInstanceSearchhotels().getCheckindate(), "05/03/2022");
		sendkeys(cm.getInstanceSearchhotels().getCheckindate(), "06/03/2022");
		singledropdown(cm.getInstanceSearchhotels().getAdultsroom(), "index", "2");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File Source3 = tss.getScreenshotAs(OutputType.FILE);
		File dest4 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\2.png");
		FileUtils.copyFile(Source3, dest4);

		click(cm.getInstanceSearchhotels().getSearch());
		click(cm.getInstanceBookhotels().getRadiobtnclk());
		click(cm.getInstanceBookhotels().getContinues());
		sendkeys(cm.getInstanceBookhotels().getFirstnames(), "Avinash");
		sendkeys(cm.getInstanceBookhotels().getLastnames(), "P");
		sendkeys(cm.getInstanceBookhotels().getAddresss(), "123 New York City");
		
		//USING CONFIGURATION READER
		String creditcardno = FileReader.getInstanceFR().getInstanceCR().getcreditcardno();
		sendkeys(cm.getInstanceBookhotels().getCreditcardno(), creditcardno);
		//*************************
		
		singledropdown(cm.getInstanceBookhotels().getCardtype(), "index", "2");
		singledropdown(cm.getInstanceBookhotels().getExpmonth(), "index", "4");
		singledropdown(cm.getInstanceBookhotels().getExpyear(), "index", "4");
		
		//USING CONFIGURATION READER
		String cvvno = FileReader.getInstanceFR().getInstanceCR().getcvvno();
		sendkeys(cm.getInstanceBookhotels().getCcvvno(), cvvno);
		//*************************
		
		TakesScreenshot tsds = (TakesScreenshot) driver;
		File Source5 = tsds.getScreenshotAs(OutputType.FILE);
		File dest6 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\3.png");
		FileUtils.copyFile(Source5, dest6);
		click(cm.getInstanceBookhotels().getBooknow());
		Thread.sleep(2000);
		click(cm.getInstanceBookhotels().getItinerary());
		TakesScreenshot tdys = (TakesScreenshot) driver;
		File Source17 = tdys.getScreenshotAs(OutputType.FILE);
		File dest18 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\4.png");
		FileUtils.copyFile(Source17, dest18);
		
		click(cm.getInstanceBookhotels().getRadio2());
		click(cm.getInstanceBookhotels().getCancelorder());
		Thread.sleep(2000);
		switchto(driver);
		TakesScreenshot tds = (TakesScreenshot) driver;
		File Source7 = tds.getScreenshotAs(OutputType.FILE);
		File dest8 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\5.png");
		FileUtils.copyFile(Source7, dest8);
		click(cm.getInstanceBookhotels().getItinerary());
		TakesScreenshot tffds = (TakesScreenshot) driver;
		File Source9 = tffds.getScreenshotAs(OutputType.FILE);
		File dest10 = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\outs\\6.png");
		FileUtils.copyFile(Source9, dest10);

	}
}
