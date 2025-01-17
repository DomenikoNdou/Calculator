package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(7,calculator.add(3,4));
        assertNotEquals(7,calculator.add(2,2));
    }

    @Test
    void subtract() {
        assertEquals(12,calculator.multiply(3,4));
        assertNotEquals(12,calculator.multiply(2,2));
    }

    @Test
    void multiply() {
        assertEquals(16,calculator.multiply(4,4));
        assertNotEquals(16,calculator.multiply(2,2));
    }

    @Test
    void divide() {
        assertEquals(1,calculator.divide(4,4));
        assertNotEquals(1,calculator.divide(4,2));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10,0));
    }
}