package zpi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalculator {

    @Test
    public void testAddition() {
        assertEquals(7, Calculator.addition(3,4));
    }

    @Test
    public void testSubtraction() {
        assertEquals(7, Calculator.subtraction(11,4));
    }

}