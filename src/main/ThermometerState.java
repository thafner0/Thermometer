import java.util.Timer;
import java.util.TimerTask;
import java.lang.Thread;

public class ThermometerState {
    private Boolean on = false;

    public void doSelfTestSystem(){
        // initialize self test system after power is on
        if (isOn() == true) {
            System.out.println("WAIT");
            // if SeslfTestSyste checkAll() returns false, power off thermometer
            if(SelfTestSystem.checkAll() == false) {
                powerOff();
            }
        }
    }

    public void beginIdle(){
        int c = 0;
        while(userInput.hasNext() == false && c < 1200){
            Thread.sleep(100);
            c++;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void powerOn() {
        on = true;
        doSelfTestSystem();
    }

    // turns thermometer off and short beep to indicate sucessfully turned off
    public void powerOff() {
        on = false;
        System.out.println("*beep*");
    }


}