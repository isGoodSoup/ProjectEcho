package com.projectecho.utils;

import org.jline.reader.LineReader;

public class Utils {
	
	public String toScan(LineReader reader, String prompt) {
		System.out.print(prompt + ": ");
		return reader.readLine();
	}
	
	public boolean toScanBoolean(LineReader reader, String prompt) {
	    System.out.print(prompt + ": ");
	    String input = reader.readLine().trim().toLowerCase();
	    return input.equals("true") || input.equals("yes") || input.equals("y");
	}
}
