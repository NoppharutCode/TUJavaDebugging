package com.tu.debugging.workshop.workshop2;

import java.util.ArrayList;

public class Order {
    ArrayList<Product> products = new ArrayList<>();
    String status;

    public double getTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
