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
}