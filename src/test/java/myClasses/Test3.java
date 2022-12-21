package myClasses;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Test3 {

    
    @Test
    public void test3() {
        C c = new C(); 
        int result = c.getDummyValue();
        assertEquals(0, result);
    }

    @Test
    public void test3_0() {
        C c = new C(); 
        int result = c.printC0();
        assertEquals(0, result);
    }

    @Test
    public void test3_1() {
        C c = new C(); 
        int result = c.printC1();
        assertEquals(0, result);
    }

    @Test
    public void test3_2() {
        C c = new C(); 
        int result = c.printC2();
        assertEquals(0, result);
    }

    @Test
    public void test3_3() {
        C c = new C(); 
        int result = c.printC3();
        assertEquals(0, result);
    }

}
