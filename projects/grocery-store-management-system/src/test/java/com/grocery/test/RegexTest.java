package com.grocery.test;

import com.grocery.util.RegexUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RegexTest {
    @Test
    public void testRegex(){
        boolean result = RegexUtil.matches("Green Apple", ".*apple.*");
        Assertions.assertTrue(result);
    }

    @Test
    public void testNoMatch(){
        boolean result = RegexUtil.matches("Milk", ".*apple.*");
        Assertions.assertFalse(result);
    }
}
