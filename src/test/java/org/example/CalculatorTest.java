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

    @Test
    void sqrt() {
        assertEquals(4.0, calculator.sqrt(16), 0.01);
        assertEquals(3.0, calculator.sqrt(9), 0.01);
        assertNotEquals(4.0, calculator.sqrt(20), 0.01);
    }

    @Test
    void sqrtOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1));
    }

    @Test
    void sqrtOfZero() {
        assertEquals(0.0, calculator.sqrt(0), 0.01);
    }
}