package com.belhard.strings;

public class Task2 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);
        
        
            strings = strings.toLowerCase().replaceAll("black", "white");

        System.out.println(strings);
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[1]);
    }
}
