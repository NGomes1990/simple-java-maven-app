package com.mycompany.app;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class App {
    // Make logger static since it's used in static main method
    private static final Logger logger = Logger.getLogger(App.class.getName());
    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        logger.info("Starting application...");
        System.out.println(MESSAGE);
        logger.info("My Message");
    }

    public String getMessage() {
        logger.info("Getting message...");
        return MESSAGE;
    }
}
