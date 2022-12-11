import java.lang.Thread;

public class DisplayScreen {
    private int tempDisplay = 0;
    private int batt = 0;

    public DisplayScreen(int temp){
        tempDisplay = this.temp;
        batt = SelfTestSystem.getBattLevel();
    }

    public void updateScreen(){
        System.out.println("temp is: "+tempDisplay);
        System.out.println("batt is: "+batt);
    }

    public void beginIdle(){
        int c = 0;
        while(userInput.hasNext() == false && c < 1200){
            Thread.sleep(100);
            c++;
        }
    }
}