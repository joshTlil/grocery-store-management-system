package com.grocery.test;

import com.grocery.model.Product;
import com.grocery.service.InventoryService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryServiceTesting {

    private InventoryService service;

    @Before
    public void setup(){
        service = new InventoryService();
    }

    @Test
    public void testAddProdcut(){
        Product p = new Product("1", "Apple", 1.50, 10);
        service.addProduct(p);

        assertEquals(p, service.getProduct("1"));
    }

}
