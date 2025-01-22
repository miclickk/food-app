package com.example.foodapp;

public class Burger extends FoodItem {
    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Бургер: " + getName();
    }
}