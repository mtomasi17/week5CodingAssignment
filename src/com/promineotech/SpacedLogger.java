package com.promineotech;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		// Prints out the string contained in log with spaces between each letter
		System.out.println(Log.replaceAll("", " "));
		
	}

	@Override
	public void Error(String Error) {
		// Prints out ERROR: String (All letters in String Error separated by spaces
		System.out.println("ERROR: " + Error.replaceAll("", " "));
		
	}

}
