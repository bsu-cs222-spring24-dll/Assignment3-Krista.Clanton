package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sillyMethodsTest {
    @Test
    public void testDidGuess42Correctly(){
        sillyMethods SillyMethods = new sillyMethods();
        boolean result = SillyMethods.didGuess42(42);
        Assertions.assertTrue(result);
    }
    @Test
    public void testDidGuess42Incorrectly(){
        sillyMethods SillyMethods = new sillyMethods();
        boolean result = SillyMethods.didGuess42(17);
        Assertions.assertFalse(result);
    }
    @Test
    public void testCountTo10(){
        sillyMethods SillyMethods = new sillyMethods();
        String result = SillyMethods.countTo(10);
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9 10", result);
    }
    @Test
    public void testCountTo15(){
        sillyMethods SillyMethods = new sillyMethods();
        String result = SillyMethods.countTo(15);
        Assertions.assertEquals("0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15", result);
    }
}
