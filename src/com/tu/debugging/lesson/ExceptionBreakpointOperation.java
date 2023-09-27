package com.tu.debugging.lesson;

public class ExceptionBreakpointOperation {
    public static void main(String[] args) {

        runUnCaughtException();

        try {
            throwException();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException");
        }


        try {
            int num1 = 20;
            int num2 = 0;

            System.out.println(Math.floorDiv(num1, num2));

        } catch (ArithmeticException e) {
         // Caught exception
            System.out.println("Caught ArithmeticException.");
        }
    }

    public static void throwException(){
        throw new UnsupportedOperationException();
    }

    public static void runUnCaughtException() {
        int num1 = 20;
        int num2 = 0;
        System.out.println(num1/num2);
    }
}
