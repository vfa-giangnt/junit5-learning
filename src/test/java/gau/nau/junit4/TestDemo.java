package gau.nau.junit4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDemo {
    
    @Test
    public void testIsPrimeNumber1() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(-1);
        assertFalse(result);
    }
    
    @Test
    public void testIsPrimeNumber2() {
        Demo demo2 = new Demo();
        boolean result = demo2.isPrimeNumber(0);
        assertFalse(result);
    }
    
    @Test
    public void testIsPrimeNumber3() {
        Demo demo2 = new Demo();
        boolean result = demo2.isPrimeNumber(2);
        assertTrue(result);
    }
    
    @Test
    public void testIsPrimeNumber4() {
        Demo demo2 = new Demo();
        boolean result = demo2.isPrimeNumber(4);
        assertFalse(result);
    }
    
    @Test
    public void testIsPrimeNumber5() {
        Demo demo2 = new Demo();
        boolean result = demo2.isPrimeNumber(5);
        assertTrue(result);
    }
    
    @Test
    public void testIsPrimeNumber6() {
        Demo demo2 = new Demo();
        boolean result = demo2.isPrimeNumber(6);
        assertFalse(result);
    }
}
