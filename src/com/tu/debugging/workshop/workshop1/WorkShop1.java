package com.tu.debugging.workshop.workshop1;

public class WorkShop1 {
    public static void main(String[] args) {
        String word = "racecar";
        Boolean result = isPalindrome(word);
        System.out.println("The word '" + word + "' is a palindrome: " + result);
    }

    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        boolean isPalindrome = true;
        while (i > j) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
