package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		// Prints the ***str***
		System.out.println("***" + Log+ "***");
		
	}

	@Override
	public void Error(String Error) {
		// Prints the top of the asterisk box
		System.out.println("****************");
		//Prints ***Error: String***
		System.out.println("***Error: " + Error + "***");
		// Prints the Bottom of the asterisk box
		System.out.println("****************");
		
	}

}
