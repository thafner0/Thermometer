package main;

public class ThermoMain {
    public static void main(String[] args) {
        //call power on method
        //check to see if powered on
        //call self check
        //perform temperature read
        ThermometerState t = new ThermometerState();
        t.powerOn();
        if(t.isOn() == true){
            SelfTestSystem s = new SelfTestSystem();
            s.checkAll();
        }
        else{
            System.out.println("The thermometer did not turn on");
        }
    }

    public static String jokeQuestion() {
        return "A block fell on Isaac Newton's Head. What did he say to his laughing assistant?";
    }

    public static String jokePunchLine() {
        return "I don't think you understand the gravity of the situation.";
    }
}
