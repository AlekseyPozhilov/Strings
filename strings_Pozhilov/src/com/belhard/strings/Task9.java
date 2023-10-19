package com.belhard.strings;

import java.util.Scanner;

public class Task9 {
    public static char getUserInput(String strings) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: " + strings);
        System.out.print("Enter symbol: ");

        String value = scanner.nextLine();

        if (value.length() != 1) {
            System.out.println("Error, invalid input");
            throw new RuntimeException("invalid input: " + value);
        }

        System.out.println("Your choice of symbol: " + value);

        return value.charAt(0);
    }

    public static int solveTask(String strings, char value) {
        int count = 0;
        
        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) == value) {
                count++;
            }
        }

        System.out.println("The symbol " + value + " appers " + count + " times");
        return count;
    }

    public static void main(String[] args) {
        char symbol = getUserInput(DemoStrings.strings[8]);
        solveTask(DemoStrings.strings[8], symbol);
    }
}
