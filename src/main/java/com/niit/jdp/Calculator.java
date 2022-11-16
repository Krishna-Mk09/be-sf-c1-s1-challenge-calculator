/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.addition(2, 4);
        System.out.println(result);

    }

    /**
     * This function takes two integers as parameters and returns the sum of the two integers.
     *
     * @param number1 The first number to add.
     * @param number2 The second number to add.
     * @return The sum of the two numbers.
     */
    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * This function takes two integers as parameters and returns the difference between them.
     *
     * @param number1 The first number to be subtracted from.
     * @param number2 The second number to subtract from the first number.
     * @return The difference between the two numbers.
     */
    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * This function takes two integers as parameters and returns the product of the two numbers.
     *
     * @param number1 The first number to be multiplied.
     * @param number2 The second number to multiply.
     * @return The product of the two numbers.
     */
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * This function takes two integers as arguments and returns the result of dividing the first argument by the second.
     *
     * @param number1 The first number to be divided.
     * @param number2 The second number to divide.
     * @return The result of the division of number1 by number2.
     */
    public double division(double number1, double number2) {
        return number1 / number2;
    }

    /**
     * This function takes two integers as parameters and returns the remainder of the first divided by the second.
     *
     * @param number1 The first number to be used in the modulo operation.
     * @param number2 The number to divide number1 by.
     * @return The remainder of the division of number1 by number2.
     */
    public double modulo(double number1, double number2) {
        return number1 % number2;
    }
}
