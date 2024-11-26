package org.example.strategyOnly;

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Credit Card Payment: $" + amount);
    }
}
