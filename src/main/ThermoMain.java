package main;
import java.util.Scanner;
import java.util.ArrayList;

public class ThermoMain {
    public static void main(String[] args) {
        //call power on method
        //check to see if powered on
        //call self check
        //perform temperature read
        ThermometerState t = new ThermometerState();
        t.powerOn();

        Scanner sc = new Scanner(System.in);
        int validInput = 0;

        ArrayList <Double> temperatures = new ArrayList<Double>();
        while(validInput < 10){
            double num = 0;
            System.out.print("Input next temperature (" + (validInput+1) + "/10):");
            try{
                num = Double.parseDouble(sc.next());
                temperatures.add(num);
                validInput++;
            } catch (NumberFormatException ignore) {
                System.out.println("Input must be a double, please try again");
            }
        }
        TemperatureRead tr = new TemperatureRead();
        var average = tr.calcAvgTemp(temperatures);
        var display = new DisplayScreen(average);
        display.displayTemp();
    }
}
