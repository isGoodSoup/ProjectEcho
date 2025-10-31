package com.projectecho.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.projectecho.utils.Utils;

public class BatchCreator {
	private Terminal terminal;
	private LineReader reader;
	private String home, file, path;
	private boolean pause;
	private Utils util = new Utils();
	
	public BatchCreator() {
		try {
			terminal = TerminalBuilder.builder().system(true).build();
			reader = LineReaderBuilder.builder()
		            .terminal(terminal)
		            .build();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public void createScript() throws IOException {
		home = System.getenv("USERPROFILE");
		file = util.toScan(reader, "Script name");
		pause = util.toScanBoolean(reader, "Pause statement");
		path = home + "\\" + file + ".bat";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			writer.write("@echo off");
			writer.newLine();
			if(pause) writer.write("pause"); writer.newLine();
		}
		System.out.println("Created: " + path);
	}

	public LineReader getReader() {
		return reader;
	}
}
