package com.grocery.test;

import com.grocery.model.Product;
import com.grocery.service.InventoryService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTesting {

    private InventoryService service;

    @BeforeEach
    public void setup(){
        service = new InventoryService();
    }

    @Test
    public void testAddProduct(){
        Product p = new Product("1", "Apple", 1.50, 10);
        service.addProduct(p);

        Assertions.assertEquals(p, service.getProduct("1"));
    }

}
