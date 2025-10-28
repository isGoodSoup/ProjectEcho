package com.projectecho.main;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		BatchCreator script = new BatchCreator();
		try {
			script.createScript();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
