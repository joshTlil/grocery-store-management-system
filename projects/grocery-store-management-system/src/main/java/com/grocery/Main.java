package com.grocery;

import com.grocery.service.FileService;
import com.grocery.service.InventoryService;
import com.grocery.util.RegexUtil;

import java.util.Scanner;

public class Main {
    private static InventoryService invService = new InventoryService();
    private static FileService<Object> fs = new FileService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //Working committing and pushing into main
        //In progress
        menu();
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

}
