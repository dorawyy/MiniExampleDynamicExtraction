package myClasses;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TestB {

    @Test
    public void testsB() {
        A a = new A();
        int result = a.printAandB();
        Assert.assertEquals(0, result);
    }

}
