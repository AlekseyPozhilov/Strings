package com.belhard.strings;

public class Task8 {
    public static boolean solveTask(String strings) {
        System.out.println("String: " + strings);

        int start = 0;
        int end = strings.length() - 1;

        while (start < end) {
            if (strings.charAt(start) != strings.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

    public static void printResult(String strings, boolean solveTask) {
        if (solveTask) {
            System.out.println(strings + " is a palindrome.");
        } else {
            System.out.println(strings + " is not a palindrome.");
        }
    }
    
    public static void main(String[] args) {
        String strings = DemoStrings.strings[7];
        boolean isPalindrome = solveTask(DemoStrings.strings[7]);
        printResult(strings, isPalindrome);
    }
}
