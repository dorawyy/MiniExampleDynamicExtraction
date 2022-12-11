package myClasses;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Test2 {

    @Test
    public void test2() {
        B b = new B();
        int result = b.printB();
        assertEquals(0, result);
    }

}
