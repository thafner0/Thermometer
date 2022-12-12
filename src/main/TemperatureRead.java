package main;

import java.util.ArrayList;

public class TemperatureRead {
    public void calcAvgTemp(ArrayList<Double> temperatures) {
        double sum = 0;
        for(int i = 0; i<temperatures.size(); i++){
            sum += temperatures.get(i);
        }
        double avgTemp = sum/temperatures.size();
        DisplayScreen ds = new DisplayScreen(avgTemp);
        ds.displayTemp();
    }

    public void errorMessage(double temp) {
        if (temp < -58 || temp > 122) {
            System.out.println("TMP ERR");
        }
    }
}