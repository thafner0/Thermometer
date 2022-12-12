package test;

import main.TemperatureRead;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

import java.util.List;

public class ThermometerReadTests {
    @Test
    public void testAverage() {
        var averages = new ArrayList<Double>(List.of(97.33, 20.15, 54.513));
        var dataSets = List.of(TestFixtures.temperatures1, TestFixtures.temperatures2, TestFixtures.temperatures3);
        TestFixtures.loadData();
        for (int i = 0; i < dataSets.size(); i++) {
            var dataSet = dataSets.get(i);
            var read = new TemperatureRead();
            var average = read.calcAvgTemp(dataSet);
            Assert.assertEquals(averages.get(i), average, 0.5);
        }
    }
}
