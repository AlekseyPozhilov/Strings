package com.belhard.strings;

public class Task1 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length(); i++) {
            char symbol = strings.charAt(i);

            if (Character.isUpperCase(symbol)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(symbol));
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[0]);
    }
}
