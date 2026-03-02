package com.grocery.service;

public class Checkout  extends Thread{
    private String laneName;

    public Checkout(String laneName){
        this.laneName = laneName;
    }

    @Override
    public void run(){
        System.out.println(laneName + "processing order...");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(laneName + " finished order.");
    }
}
