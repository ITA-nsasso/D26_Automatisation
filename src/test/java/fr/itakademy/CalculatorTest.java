package fr.itakademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();

    @Test
    void should_add_correctly() {
        assertEquals(8, calculator.add(4, 4));
    }

    @Test
    void add_should_not_be_equal() {
        assertNotEquals(12, calculator.add(5, 8));
    }

    @Test
    void subtract_should_be_equal() {
        assertEquals(-3, calculator.subtract(5, 8));
    }

    @Test
    void subtract_should_not_be_equal() {
        assertNotEquals(13, calculator.add(5, 8));
    }

    @Test
    void multiply_should_be_equal() {
        assertEquals(40, calculator.add(5, 8));
    }

    @Test
    void multiply_should_not_be_equal() {
        assertNotEquals(12, calculator.add(5, 8));
    }

    @Test
    void divide_should_be_equal() {
        assertEquals(0.625, calculator.add(5, 8));
    }

    @Test
    void divide_should_not_be_equal() {
        assertNotEquals(5, calculator.add(5, 8));
    }

    @Test
    void divide_0_should_be_equal() {
        assertEquals(0, calculator.add(5, 0));
    }

    @Test
    void divide_0_should_not_be_equal() {
        assertNotEquals(5, calculator.add(5, 0));
    }
}