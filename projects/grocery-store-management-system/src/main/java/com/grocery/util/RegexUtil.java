package com.grocery.util;

import java.util.regex.Pattern;

public class RegexUtil {
    public static boolean matches(String input, String regex){
        return Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
                .matcher(input)
                .find();
    }
}
