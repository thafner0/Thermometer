import java.lang.Thread;

public class DisplayScreen {
    private double tempDisplay = 0;
    private int batt = 0;
    public boolean isCelsius = false;
    private String str = "";

    public DisplayScreen(double temp){
        tempDisplay = this.temp;
        batt = SelfTestSystem.getBattLevel();
    }

    public void updateScreen(){
        if(isCelsius == true){
            str = "C";
        }else{
            str = "F";
        }
        System.out.println("temp is: "+tempDisplay+" "+str);
        System.out.println("batt is: "+batt);
    }

    public void convertToCelsius(){
        tempDisplay = ((tempDisplay - 32)*5)/9;
        isCelsius = true;
    }

    public void beginIdle(){
        int c = 0;
        while(userInput.hasNext() == false && c < 1200){
            Thread.sleep(100);
            c++;
        }
    }
}