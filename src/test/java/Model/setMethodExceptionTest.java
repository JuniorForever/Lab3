package Model;

import org.junit.Assert;
import org.junit.Test;

public class setMethodExceptionTest extends Exception{
    @Test
    public void setMethodExceptionTest() {
        try {
            Worker.Work("qwerty");
            Assert.fail("Ожидался setMethodException");
        }catch(setMethodException el){
            System.out.println("Вызвалось исключение setMethodException");
        }
    }
}
