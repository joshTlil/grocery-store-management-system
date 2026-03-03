package com.grocery;

import com.grocery.service.FileService;
import com.grocery.service.InventoryService;

import java.util.Scanner;

public class Main {
    private static InventoryService invService = new InventoryService();
    private static FileService<Object> fs = new FileService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
