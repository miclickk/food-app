package com.example.foodapp;

public class OrderService {
    public Order createOrder(FoodItem... items) {
        Order order = new Order();
        for (FoodItem item : items) {
            order.addItem(item);
        }
        return order;
    }
}