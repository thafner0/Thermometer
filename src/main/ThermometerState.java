package main;

import java.lang.Thread;
import java.util.Scanner;

public class ThermometerState {
    private Boolean on = false;
    private final Scanner userInput = new Scanner(System.in);

    public void doSelfTestSystem(){
        // initialize self test system after power is on
        if (isOn()) {
            System.out.println("WAIT");
            // if SelfTestSystem checkAll() returns false, power off thermometer
            if(!new SelfTestSystem().checkAll()) {
                System.out.println("Self Test Failed - Powering Off");
                powerOff();
            }
        }
    }

    public void beginIdle() throws InterruptedException {
        int c = 0;
        while(!userInput.hasNext() && c < 1200){
            Thread.sleep(100);
            c++;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void powerOn() {
        on = true;
        doSelfTestSystem();
    }

    // turns thermometer off and short beep to indicate sucessfully turned off
    public void powerOff() {
        on = false;
        System.out.println("*beep*");
    }


}