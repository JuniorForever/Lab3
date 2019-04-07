package Model;

import org.junit.Assert;
import org.junit.Test;

public class setWorkerNameExceptionTest extends Exception {
    @Test
    public void setWorkerNameExceptionTest() {
       try {
          Worker.setWorkerName("1111");
             Assert.fail("Ожидался setWorkerNameException");
        } catch (setWorkerNameException thrown) {
           System.out.println("Вызвалось исключение setWorkerNameException");
        }
    }
}