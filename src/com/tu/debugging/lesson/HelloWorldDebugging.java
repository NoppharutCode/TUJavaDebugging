package com.tu.debugging.lesson;

public class HelloWorldDebugging {
    public static void main(String[] args) {
        int printCount = 0;

        printCount += 1;
        System.out.println("Hello world print count: " + printCount);

        printCount += 1;
        System.out.println("Hello world print count: " + printCount);
    }
}
