package Model;

import org.junit.Assert;
import org.junit.Test;

public class setWeightExceptionTest extends Exception {
    @Test
    public void setWeightExceptionTest() {
        try {
            Tool.setWeight(0);
            Assert.fail("Ожидался setWeightException");
        }catch (setWeightException thrown){
            System.out.println("Вызвалось исключение setWeightException");
        }
    }
}
