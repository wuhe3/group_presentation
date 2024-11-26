package org.example.strategyMixFactory;

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Create the payment strategy through the factory instead of creating it directly
    public void setPaymentStrategy(String paymentType) {
        this.paymentStrategy = PaymentStrategyFactory.createPayment(paymentType);
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
