package com.tu.debugging.lesson;

import com.tu.debugging.visible.Calculator;

public class ForceReturnAndThrowException {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // the sum should be 20.0
        double sum = calculator.add(10.0, 10.0);
        System.out.println("Sum: " + sum);


        try {
            // the divide should be 1
            double divide = calculator.divide(10.0, 10.0);
            System.out.println("Divide: " + divide);
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
