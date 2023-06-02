package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        String message = "Captains Log";

        asteriskLogger.Log(message);
        asteriskLogger.Error(message);

        spacedLogger.Log(message);
        spacedLogger.Error(message);
    }
}
