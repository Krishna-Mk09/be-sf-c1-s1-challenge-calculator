package com.niit.jdp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void main() {
    }

    @Test
        // This is a test case for the addition function.
    void addition() {
        double number1 = 100.0;
        double number2 = 100.0;
        double expected = 200.0;
        double actual = calculator.addition(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    // This is a test case for the subtraction function.
    @Test
    void subtraction() {
        double number1 = 100.0;
        double number2 = 100.0;
        double expected = 0.0;
        double actual = calculator.subtraction(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * This function tests the multiplication function of the calculator class.
     */
    @Test
    void multiplication() {
        double number1 = 10.0;
        double number2 = 10.0;
        double expected = 100.0;
        double actual = calculator.multiplication(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Division() should return 1.0 when dividing 100.0 by 100.0.
     */
    @Test
    void division() {
        double number1 = 100.0;
        double number2 = 100.0;
        double expected = 1.0;
        double actual = calculator.division(number1, number2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
        // This is a test case for the modulo function.
    void modulo() {
        double number1 = 100.0;
        double number2 = 100.0;
        double expected = 0.0;
        double actual = calculator.modulo(number1, number2);
        Assertions.assertEquals(expected, actual);
    }
}