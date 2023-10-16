package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);

        Pattern pattern = Pattern.compile("( )+");
        Matcher matcher = pattern.matcher(strings);

        int maxSpaces = 0;

        while (matcher.find()) {
            int spacesCount = matcher.group().length();
            if (spacesCount > maxSpaces) {
                maxSpaces = spacesCount;
            }
        }

        System.out.println("Largest number of consecutive spaces: " + maxSpaces);
    }

    public static void main(String[] args) {
        solveTask(DemoStrings.strings[5]);
    }
}
