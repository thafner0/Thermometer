package main;

import java.util.Scanner;

public class SelfTestSystem {
    private boolean batteryCheck = false;
    private boolean sensorCheck = false;
    private boolean displayCheck = false;
    private int battLevel;
    Scanner userInput = new Scanner(System.in);


    // Method to get/check battery level from user input
    public boolean checkBattery() {
        System.out.print("Enter current battery level (# between 0-100): ");
        if (userInput.hasNextInt()) {
            battLevel = userInput.nextInt();
            if (battLevel == 0) { // Case when battery is dead
                System.out.println("Thermometer battery is dead!\n");
                return batteryCheck;
            } else if (battLevel > 0 && battLevel <= 15) { // Case when battery is low (1%-15%)
                lowBatteryAlert();
                batteryCheck = true;
                return batteryCheck;
            } else if (battLevel > 100 || battLevel < 0) { // Case when user inputs impossible battery level
                System.out.println("Battery level not possible! Try again.");
                return checkBattery();
            } else { // Case when battery level is in standard range (16%-100%)
                System.out.println("Battery level is sufficient.");
                batteryCheck = true;
                return batteryCheck;
            }
        } else {
            System.out.println("Input can only be integers! Try again!");
            userInput.next();
            return checkBattery();
        }
    }

    // Method to check is sensor is working
    public boolean checkSensor() {
        System.out.print("Is sensor recieving input? Enter \"yes\" or \"no\": ");
        String sensorState = userInput.next();
        if(sensorState.equalsIgnoreCase("yes")) { // Case when sensor is working
            System.out.println("Sensor is working properly.\n");
            sensorCheck = true;
            return sensorCheck;
        } else if (sensorState.equalsIgnoreCase("no")) { // Case when sensor is not working
            // TODO: Consider switching this out for a TempErr <-- Didn't yet b/c isn't taking in a temp to check status
            System.out.println("Sensor is not working.\n");
            return sensorCheck;
        } // Case when input is not valid
        System.out.println("Invalid input. Try again.");
        return checkSensor();
    }

    // Method to check if display is working
    public boolean checkDisplay() {
        System.out.print("If you can read this message, type \"yes\": ");
        String displayState = userInput.next();
        if (displayState.equalsIgnoreCase("yes")) { // Case when display is working properly
            System.out.println("Display functioning properly\n");
            displayCheck = true;
            return displayCheck;
        }   // It is assumed if display is working, user will be able to read prompt and enter yes
            // So, in all other cases, display must not be working
        System.out.println("DisplayScreen not working.\n");
        return displayCheck;
    }

    public boolean checkAll() {
        boolean battCheck = checkBattery();
        boolean sensCheck = checkSensor();
        boolean dispCheck = checkDisplay();
        System.out.println();

        if (battCheck && sensCheck && dispCheck) { // Case when all checks return true/successful results
            System.out.println("System is working properly!");
            return true;
        }
        System.out.println("WARNING! One or more tests have failed:");
        if (!battCheck) { // Begins cases to check which tests failed
            System.out.println("Battery check failed!");
        }
        if (!sensCheck) {
            System.out.println("Sensor check failed!");
        }
        if (!dispCheck) {
            System.out.println("Display check failed!");
        }
        return false;
    }

    // Method to handle low battery alerts.
    public void lowBatteryAlert() {
        System.out.println("*beep* *beep* *beep*");
        System.out.println("LOW BAT");
        System.out.println("Your battery is at: " + battLevel + "% charge. Replace soon!");
    }
    
    // Getter method for battery level
    public int getBattLevel() {
        return battLevel;
    }
}