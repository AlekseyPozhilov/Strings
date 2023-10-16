package com.belhard.strings;

public class Task7 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);
        System.out.println(strings.toLowerCase().replaceAll("a", "ab"));
    }
    
    public static void main(String[] args) {
        solveTask(DemoStrings.strings[6]);
    }
}
