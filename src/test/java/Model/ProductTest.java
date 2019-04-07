package Model;

import View.ViewClass;
import org.junit.Before;
import org.junit.Test;

import static View.ViewClass.getScrewdriver;
import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void checkReady() {
        String expected;
        if(ViewClass.getScrewdriver()=="Раскрутить"){
            expected="Готово";
        }else{
            expected="Не готово";
        }
        String actual = Product.checkReady();
        assertEquals(expected,actual);
    }
}