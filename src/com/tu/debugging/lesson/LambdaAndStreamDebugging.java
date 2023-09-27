package com.tu.debugging.lesson;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStreamDebugging {
    public static void main(String[] args) {

        String[] array =  {"a", "b", "c", "d", "e", "f", "g"};

        List<Integer> result = Stream.of(array).filter(str -> str.charAt(0) > 95).map(str-> str.toUpperCase()).map(str -> (int)(str.charAt(0))).collect(Collectors.toList());
        System.out.println(result);
    }
}
