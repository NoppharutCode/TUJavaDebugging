package com.tu.debugging.lesson;

public class BasicDebuggingOperation {
    public static void main(String[] args) {
        System.out.println("Starting basic debugging operation.");
        int[] numbers = {1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10};

        int sum = calculateSum(numbers);

        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}
