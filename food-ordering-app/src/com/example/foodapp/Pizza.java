package com.example.foodapp;

public class Pizza extends FoodItem {
    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Пицца: " + getName();
    }
}