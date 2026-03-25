package com.grocery.test;

import com.grocery.util.RegexUtil;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexTest {
    @Test
    public void testRegex(){
        boolean result = RegexUtil.matches("Green Apple", ".*apple.*");
        assertTrue(result);
    }

    @Test
    public void testNoMatch(){
        boolean result = RegexUtil.matches("Milk", ".*apple.*");
        assertFalse(result);
    }
}
