package myClasses;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Test1 {

    @Test
    public void test1() {
        A a = new A();
        int result = a.printA();
        assertEquals(0, result);
    }

    @Test
    public void test2() {
        A a = new A();
        B b = new B();
        int result = a.print(b, b);
        assertEquals(1, result);
    }

}
