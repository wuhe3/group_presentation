package org.example.strategyMixFactory;

class PaymentStrategyFactory {
    public static PaymentStrategy createPayment(String type) {
        return switch (type) {
            case "CREDIT_CARD" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            default -> throw new IllegalArgumentException("Unknown payment type");
        };
    }
}
