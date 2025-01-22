package com.example.foodapp;

public class PaymentService {
    public void pay(Order order, String paymentMethod) {
        System.out.println("Оплата заказа на сумму "
                + order.getTotalPrice() + " через " + paymentMethod);
    }
}