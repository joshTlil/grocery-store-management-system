package com.grocery;

import com.grocery.model.Product;
import com.grocery.service.Checkout;
import com.grocery.service.FileService;
import com.grocery.service.InventoryService;
import com.grocery.util.RegexUtil;

import java.util.Scanner;

public class Main {
    private static InventoryService invService = new InventoryService();
    private static FileService<Object> fs = new FileService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //False to prevent while loop from running in current state
        boolean running = false;

        while(running){
            menu();
            String choice = scanner.nextLine();

            switch(choice){
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    private static void menu(){
        System.out.println("Grocery Store Management System");
        System.out.println("1. Add Product");
        System.out.println("2. View Product");
        System.out.println("3. Search Product");
        System.out.println("4. Checkout");
        System.out.println("5. Save Inventory");
        System.out.println("6. Load Inventory");
        System.out.println("0. Exit");
        System.out.println("Select Option: ");
    }

    private static void saveInventory(){
        try{
            fs.save("inventory.ser", invService);
            System.out.println("Inventory saved");
        }catch (Exception e){
            System.out.println("Error saving inventory");
        }
    }

    private static void loadInventory(){
        try{
            invService = (InventoryService) fs.load("inventory.ser");
            System.out.println("Inventory loaded");
        }catch (Exception e){
            System.out.println("Error loading inventory");
        }
    }

    private static void searchProduct(){
        System.out.println("Search product: ");
        String pattern = scanner.nextLine();

        invService.getAllProducts().forEach(product -> {
            if(RegexUtil.matches(product.getName(), pattern)){
                System.out.println(product);
            }
        });
    }

    private static void addProduct(){
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, price, quantity);
        invService.addProduct(product);

        System.out.println("Product added successfully!");
    }

    private static void viewAllProducts(){
        invService.getAllProducts().forEach(System.out::println);
    }

    private static void simulateCheckout() {
        Checkout lane1 = new Checkout("Lane 1");
        Checkout lane2 = new Checkout("Lane 2");

        lane1.start();
        lane2.start();
    }

}
