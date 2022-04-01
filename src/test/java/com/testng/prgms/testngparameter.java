package com.testng.prgms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class testngparameter {

	public void getusername(String username, String password) {
		System.out.println("Username is :" + username + "Password is:" + password);
	}

	@DataProvider(name = "testdata")
	public Object[][] testData() {
		return new Object[][] { { "adc", "123" }, { "Avi", "323" } };

	}
}
