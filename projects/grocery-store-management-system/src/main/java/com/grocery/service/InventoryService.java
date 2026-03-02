package com.grocery.service;

import com.grocery.model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private Map<String, Product> inventory = new HashMap<>();


    public void addProduct(Product product){
        inventory.put(product.getId(), product);
    }

    public Product getProduct(String id){
        return inventory.get(id);
    }

    public Collection<Product> getAllProducts(){
        return inventory.values();
    }

    public void removeProduct(String id){
        inventory.remove(id);
    }
}
