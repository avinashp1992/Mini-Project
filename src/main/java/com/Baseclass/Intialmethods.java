package com.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Intialmethods {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("Try To Download the Driver");

		}
		return driver;
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement elements, String value) {
		elements.sendKeys(value);
	}

	public static void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,2500)", "");
	}

	public static void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,0)", "");
	}

	public static void click(WebElement elements) {
		elements.click();
	}

	public static void singledropdown(WebElement element, String selectmethod, String value) {
		Select s = new Select(element);
		if (selectmethod.equalsIgnoreCase("value")) {
			s.selectByValue(selectmethod);
		} else if (selectmethod.equalsIgnoreCase("visible")) {
			s.selectByValue(value);
		} else if (selectmethod.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

	}

	public static void takescreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\src\\output");
		FileUtils.copyFile(Source, dest);

	}

	public static void actions(WebElement elements) {
		Actions s = new Actions(driver);
		s.click(elements).build().perform();

	}

	public static void switchto(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void quit(WebDriver driver) {
		driver.quit();
	}

	public static void close(WebDriver driver) {
		driver.close();
	}

	public static void gettitle(WebDriver driver, String titels) {
		driver.getTitle();
	}

	public static void geattribute(WebDriver driver, String art) {
		driver.get(art);
	}

	public static void wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void frame(WebDriver driver, WebElement emts) {
		driver.switchTo().frame(emts);
	}

	public static void defaultcontent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static void windowhandle(WebDriver driver) {
		driver.getWindowHandle();
	}

	public static void isselected(WebDriver driver, WebElement element) {
		boolean str = element.isSelected();
		System.out.println("The Element is Selected: " + str);

	}

	public static void Enable(WebElement element) {
		boolean str2 = element.isEnabled();
		System.out.println("The Element is Enabled: " + str2);
	}

}
