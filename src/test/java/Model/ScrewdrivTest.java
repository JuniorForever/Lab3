package Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScrewdrivTest {

    @Test
    public void unleash() {
        String actual = Screwdriv.Unleash();
        String expected = "Раскрутить";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void twist() {
        String actual = Screwdriv.Twist();
        String expected = "Закрутить";
        Assert.assertEquals(expected,actual);
        Assert.fail();
    }
}