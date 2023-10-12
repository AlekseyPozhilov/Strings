package com.belhard.strings;

public class Task1 {
    public static void solveTask(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                char tmp = strings[i].charAt(j);

                if (Character.isUpperCase(tmp)) {
                    sb.append("_");
                }
                sb.append(Character.toLowerCase(tmp));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String[] strings = StringsUtil.printArrayStrings();
        solveTask(strings);
    }
}
