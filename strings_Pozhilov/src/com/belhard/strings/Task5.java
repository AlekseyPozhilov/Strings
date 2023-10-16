package com.belhard.strings;

public class Task5 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);
        System.out.println(strings.replaceAll("\\s+", " ").trim());
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[4]);
    }
}
