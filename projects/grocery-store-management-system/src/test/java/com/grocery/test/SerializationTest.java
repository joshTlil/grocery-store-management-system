package com.grocery.test;

import com.grocery.service.FileService;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class SerializationTest {
    @Test
    public void fileSerializationTest() throws Exception{
        FileService<String> fileService = new FileService<>();
        String testData = "Test Inventory";
        fileService.save("test.ser", testData);
        String loadData = fileService.load("test.ser");
        assertEquals(testData, loadData);
        new File("test.ser").delete();
    }
}
