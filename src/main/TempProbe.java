public class TempProbe{
    private int temp = 0;
    private double avgTemp = 0;
    private boolean readTemp;

    public checkTemp(){
        //checkTemp code goes here
        new DisplayScreen ds = DisplayScreen(temp);
    }

    public Double calcAvgTemp(Double temp1, Double temp2, Double temp3, Double temp4, Double temp5, Double temp6, Double temp7, Double temp8, Double temp9, Double temp10){
        avgTemp = (temp1+temp2+temp3+temp4+temp5+temp6+temp7+temp8+temp9+temp10)/10;
        new DisplayScreen ds = DisplayScreen(avgTemp);
    }
    public String errorMessage(Double temp){
        if (temp < -58 || temp > 122){
            System.out.println("TMP ERR");
        }
    }
}