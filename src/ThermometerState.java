import java.util.Timer;
import java.util.TimerTask;

public class ThermometerState {
    private Boolean on = false;


    public void doSelfTestSystem(){
        // initialize self test system after power is on
        if (isOn()) {
            SelfTestSystem.checkAll();
            System.out.println("WAIT");

            // if power is on and self test system passes tests return self test system passed
            if (SelfTestSystem.checkAll(true)) {
                return selfTestSystemPassed();
            } else if (SelfTestSystem.checkAll(false)) { // retuns self test system failed
                return selfTestSystemFailed();
            }
        }
    }

    // thermometer is on and after 120 seconds of being idle, initiate power off
    public Boolean isIdle() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            public void run() {
                powerOff();
            }
        }

    }

    public String selfTestSystemFailed() {
        // low battery alert if battery check false
        // temp error alert if temp check false
        // display check false powerOff
        //
    }

    public String selfTestSystemPassed() {
        // two beeps
        // batter level displayed
    }

    public boolean isOn() {
        return on;
    }

    public void powerOn() {
        on = true;
        doSelfTestSystem();
    }

    public boolean isOff() {
        return off;
    }

    // turns thermometer off and plays 1 short beep to indicate sucessfully turned off
    public void powerOff() {
        on = false;

        // TO DO: implement beep
    }


}