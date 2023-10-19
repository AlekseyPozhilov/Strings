package com.belhard.strings;

public class Task10 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);

        String[] words = strings.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest word: " + longestWord);
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[9]);
    }
}
