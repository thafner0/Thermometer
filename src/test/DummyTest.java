package test;

import main.ThermoMain;
import org.junit.Assert;
import org.junit.Test;

public class DummyTest {
    @Test
    public void testJokeIsFunny() {
        Assert.assertEquals("The joke question was not the expected value.", "A block fell on Isaac Newton's Head. What did he say to his laughing assistant?", ThermoMain.jokeQuestion());
        Assert.assertEquals("The joke punch line was not the expected value.", "I don't think you understand the gravity of the situation.", ThermoMain.jokePunchLine());
    }
}
