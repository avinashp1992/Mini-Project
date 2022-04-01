package com.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File fs = new File(
				"C:\\Users\\AVINASH\\eclipse-workspace\\Maven1stDay\\src\\test\\java\\com\\configuration\\Configuration.properties");
		FileInputStream fi = new FileInputStream(fs);
		p = new Properties();
		p.load(fi);
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getcreditcardno() {
		String creditcardno = p.getProperty("creditcardno");
		return creditcardno;
	}

	public String getcvvno() {
		String cvvno = p.getProperty("cvvno");
		return cvvno;
	}

}
