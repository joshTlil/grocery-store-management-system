package com.grocery.test;

import com.grocery.util.RegexUtil;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
