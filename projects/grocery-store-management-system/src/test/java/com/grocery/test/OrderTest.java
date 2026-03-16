package com.grocery.test;

import com.grocery.model.Order;
import com.grocery.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    @Test
    public void testCalculation(){
        Order order = new Order("John");

        order.addProduct(new Product("1", "Apple", 2.00, 1));
        order.addProduct(new Product("2", "Milk", 3.00, 1));

        assertEquals(5.00, order.calculateTotal(), 0.001);
    }
}
