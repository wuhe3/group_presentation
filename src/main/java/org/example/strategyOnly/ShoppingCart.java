package org.example.strategyOnly;

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Directly handle the selection and creation of strategies in the Context
    public void setPaymentStrategy(String paymentType) {
        // Drawback 1: the creation logic of strategies is exposed in the Context, it should be hidden
        // Drawback 2: needs to be modified every time a new strategy is added
        if ("CREDIT_CARD".equals(paymentType)) {
            this.paymentStrategy = new CreditCardPayment();
        } else if ("PAYPAL".equals(paymentType)) {
            this.paymentStrategy = new PayPalPayment();
        } else {
            throw new IllegalArgumentException("Unknown payment type");
        }
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
