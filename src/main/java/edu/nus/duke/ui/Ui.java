package edu.nus.duke.ui;

public class Ui {
    // Constructor
    public Ui() {
        printMessage("Hello! I'm Jarvis\nWhat can I do for you?");
    }

    // Methods
    public static void printMessage(String message) {
        printMessage(message, true);
    }

    public static void printMessage(String message, Boolean isSepLine) {
        System.out.println(message);
        if (isSepLine) {
            System.out.println("____________________________________________________________");
        }
    }
}
