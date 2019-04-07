package Model;

import org.junit.Assert;
import org.junit.Test;

public class setLengthExceptionTest extends Exception {
    @Test
    public void setLengthExceptionTest() {
        try {
            Saw.setLength(0);
            Assert.fail("Ожидался setLengthException");
        }catch (setLengthExeption qwer){
            System.out.println("Вызвалось исключение setLengthException");
        }
    }
}
