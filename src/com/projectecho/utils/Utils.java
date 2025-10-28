package com.projectecho.utils;

import org.jline.reader.LineReader;

public class Utils {
	
	public String toScan(LineReader reader, String prompt) {
		System.out.print(prompt + ": ");
		return reader.readLine();
	}
}
