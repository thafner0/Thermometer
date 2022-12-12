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
        tr.calcAvgTemp(temperatures);
    }

    //remove these when tests are updated
    public static String jokeQuestion() {
        return "A block fell on Isaac Newton's Head. What did he say to his laughing assistant?";
    }

    public static String jokePunchLine() {
        return "I don't think you understand the gravity of the situation.";
    }
}
