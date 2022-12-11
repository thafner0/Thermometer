public class TemperatureRead {
    private double avgTemp = 0;

    private long lastUpdateTime = 0;

    public long getTime(){
        return lastUpdateTime;
    }
    public void calcAvgTemp(double temp1, double temp2, double temp3, double temp4, double temp5, double temp6, double temp7, double temp8, double temp9, double temp10) {
        avgTemp = (temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8 + temp9 + temp10) / 10;
        new DisplayScreen ds = DisplayScreen(avgTemp);
        lastUpdateTime = System.currentTimeMillis();
    }

    public String errorMessage(double temp) {
        if (temp < -58 || temp > 122) {
            System.out.println("TMP ERR");
        }
    }
}