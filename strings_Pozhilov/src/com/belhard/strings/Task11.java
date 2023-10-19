package com.belhard.strings;

public class Task11 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);
        
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        
        for (int i = 0; i < strings.length(); i++) {
            char symbol = strings.charAt(i);
            if (Character.isLowerCase(symbol)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(symbol)) {
                uppercaseCount++;
            }
        }

        System.out.println("Number of lowercase letters: " + lowercaseCount);
        System.out.println("Number of capital letters: " + uppercaseCount);
    }
    
    public static void main(String[] args) {
        solveTask(DemoStrings.strings[10]);
    }
}
