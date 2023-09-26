package com.tu.debugging.workshop.workshop2;

import java.util.ArrayList;

public class Shop {
    ArrayList<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public Order prepareOrder(String[] productNames, String paymentType) {
        Order order = new Order();
        for (String productName : productNames) {
            Product product = findProductByName(productName);
            order.addProduct(product);
        }

        PaymentGateway paymentGateway = PaymentGateway.getPaymentGateway(paymentType);

        if (paymentGateway.processPayment(order.getTotalCost())) {
            order.setStatus("Paid");
        } else {
            order.setStatus("Payment Failed");
        }

        return order;
    }

    public Product findProductByName(String productName) {
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
