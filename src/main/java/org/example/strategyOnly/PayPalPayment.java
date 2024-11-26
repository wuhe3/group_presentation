package org.example.strategyOnly;

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("PayPal Payment: $" + amount);
    }
}