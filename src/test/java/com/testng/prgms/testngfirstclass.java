package com.testng.prgms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngfirstclass {
	@BeforeSuite
	public void setup()
	{
		System.out.println("System Set Property");
	}
	@BeforeTest
	public void browserlaunch()
	{
	 System.out.println("Launch the Browser");
	}
	@BeforeClass
	public void url()
	{
		System.out.println("Launch the URL");
		
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("Login");
	}
	@Test
	public void searchmobile()
	{
		System.out.println("Search For Mobile");
	}
	@Test
	public void searchlaptop()
	{
		System.out.println("Search For Laptop");
	}
	@AfterMethod
	public void verify()
	{
		System.out.println("Verify The Test Results");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("Logout");
	}
	@AfterTest
	public void closethebrowser()
	{
		System.out.println("Close The Browser");
	}
	@AfterSuite
	public void clearcookies()
	{
		System.out.println("Delete the Cookies");
	}

}
