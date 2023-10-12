package com.belhard.strings;

public class Task2 {
    public static void solveTask(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toLowerCase().replaceAll("black", "white");
        }

        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String[] strings = StringsUtil.printArrayStrings();
        solveTask(strings);
    }
}
