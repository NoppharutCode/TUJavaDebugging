package com.tu.debugging.workshop.workshop2;

import java.util.ArrayList;

public class WorkShop2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new Product("Book", 29.99));
        shop.addProduct(new Product("Pencil", 2.99));

        Order order = shop.prepareOrder(new String[]{"Book", "Pencil", "MacBook"}, "creditcard");

        System.out.println("Order total: " + order.getTotalCost());
        System.out.println("Order status: " + order.getStatus());
    }
}
