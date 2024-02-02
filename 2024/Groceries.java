package org.example;

public class Groceries {
    private final org.example.Product[] products = new org.example.Product[10];
    private int spaceAvailable = products.length;


    public void addProduct(org.example.Product product) {
        if (spaceAvailable <= 0) {
            System.out.println("Немає вільного місця!");
            return;
        }
