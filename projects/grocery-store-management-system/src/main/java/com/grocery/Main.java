package com.grocery;

import com.grocery.service.FileService;
import com.grocery.service.InventoryService;

import java.util.Scanner;

public class Main {
    private static InventoryService invService = new InventoryService();
    private static FileService<Object> fs = new FileService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //Working committing and pushing into main
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
}
