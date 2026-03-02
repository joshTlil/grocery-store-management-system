package com.grocery.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

    private List<Product> products = new ArrayList<>();
    private String customerName;

    public Order(String customerName){
        this.customerName = customerName;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateTotal(){
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public class Receipt {
        public void printReceipt(){
            System.out.println("Customer: " + customerName);
            products.forEach(System.out::println);
            System.out.println("Total: $ " + calculateTotal());
        }
    }
}
