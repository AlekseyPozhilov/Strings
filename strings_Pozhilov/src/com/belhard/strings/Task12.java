package com.belhard.strings;

public class Task12 {
    public static int solveTask(String strings) {
        System.out.println("String: " + strings);

        int count = 0;

        for (int i = 0; i < strings.length(); i++) {
            char symbol = strings.charAt(i);
            if (symbol == '.' || symbol == '!' || symbol == '?') {
                count++;
            }
        }
        
        System.out.println("Number of sentences in the text: "  + count);
        
        return count;
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[11]);
    }
}
