package com.Reader;

import java.io.IOException;

public class FileReader {

	private FileReader() {

	}

	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader cs = new ConfigurationReader();
		return cs;

	}

	public static FileReader getInstanceFR() {
		FileReader hs = new FileReader();
		return hs;
	}
}
