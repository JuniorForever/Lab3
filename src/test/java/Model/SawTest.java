package Model;

import org.junit.Test;

import static org.junit.Assert.*;

public class SawTest {

    @Test
    public void cut() {
        Saw.Cut(Hervesting.Form);
        String actual = Hervesting.Form;
        String expected = "Форма изменена пилой" ;
        assertEquals(expected,actual);
    }
}