import java.util.Timer;
import java.util.TimerTask;

public class ThermometerState {
    private Boolean on = false;
    private Boolean isIdle = false;

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

    // thermometer is on and after 120 seconds of being idle, initiate power off
    public Boolean isIdle() {

        long currentTime = System.currentTimeMillis();
        long lastUpdatedTime = TemperatureRead.getTime();

        if (currentTime >= lastUpdatedTime + 120000) {
            isIdle = true;
            powerOff();
            return true;
        } else {
            return false;
        }

//        Timer timer = new Timer();
//        TimerTask timerTask = new TimerTask() {
//            public void run() {
//                powerOff();
//            }
//        }
//
//        return timerTask.schedule(task, 120000);
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