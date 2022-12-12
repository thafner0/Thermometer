package test;

import main.TemperatureRead;
import main.ThermoMain;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import java.util.List;

public class ThermometerReadTests {
    @Test
    public void testJokeIsFunny() {
        Assert.assertEquals("The joke question was not the expected value.", "A block fell on Isaac Newton's Head. What did he say to his laughing assistant?", ThermoMain.jokeQuestion());
        Assert.assertEquals("The joke punch line was not the expected value.", "I don't think you understand the gravity of the situation.", ThermoMain.jokePunchLine());
    }

    @Test
    public void testAverage() {
        var list = new ArrayList<Double>(List.of(10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0));
        var read = new TemperatureRead();
        var average = read.calcAvgTemp(list);
        Assert.assertEquals(50.0, average, 0.5);
    }
}
