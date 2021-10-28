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
}