package com.tu.debugging.visible;

public class Calculator {
    // declare the method for addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // declare the method for subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // declare the method for multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // declare the method for division
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Error! Dividing by zero is not allowed.");
        }
    }
}
