package org.example.strategyMixFactory;

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("PayPal Payment: $" + amount);
    }
}