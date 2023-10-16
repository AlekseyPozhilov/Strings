package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void solveTask(String strings) {
        System.out.println("String: " + strings);
        
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(strings);
        
        int num = 0;

        while (matcher.find()) {
            num++;
        }
        
        System.out.println("Number of digits in text: " + num);
    }
    
    public static void main(String[] args) {
        solveTask(DemoStrings.strings[3]);
    }
}
