package main;

public class DisplayScreen {
    private double tempDisplay = 0;
    private int batt = 0;
    public boolean isCelsius = false;

    public DisplayScreen(double temp) {
        tempDisplay = temp;
        batt = new SelfTestSystem().getBattLevel();
    }

    public void displayTemp(){
        String tempType = "";

        if(isCelsius){
            tempType = "C";
        }else{
            tempType = "F";
        }
        System.out.println("temp is: "+tempDisplay+" "+tempType);
        System.out.println("batt is: "+batt);
    }

    public void convertToCelsius(){
        tempDisplay = ((tempDisplay - 32)*5)/9;
        isCelsius = true;
    }

}