package com.belhard.strings;

public class StringsUtil {
    public static String[] printArrayStrings() {
        String[] strings = DemoStrings.strings;

        for (String string : strings) {
            System.out.println(string);
        }
        return strings;
    }
    
}
