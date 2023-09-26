package com.tu.debugging.workshop.workshop2;

public class PaymentGateway {

    private boolean isSuccess;

    PaymentGateway(String type) {
        // Here we might set different options or services depending on the type
    }

    public boolean processPayment(double cost) {
        // Connect to external service, make payment request, process response
        // For simplicity, let's simulate it with a random boolean
        isSuccess = new java.util.Random().nextBoolean();
        return isSuccess;
    }

    public static PaymentGateway getPaymentGateway(String type) {
        // Here we might choose between different gateway implementations depending on the type
        // But for simplicity, we just create a new gateway and assume it's the right type
        return new PaymentGateway(type);
    }
}
