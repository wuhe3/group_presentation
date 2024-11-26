package org.example.strategyMixFactory;

// Client
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy("CREDIT_CARD");
        cart.checkout(100);
        cart.setPaymentStrategy("PAYPAL");
        cart.checkout(200);
    }
}
