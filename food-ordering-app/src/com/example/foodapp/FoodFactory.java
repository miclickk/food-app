package com.example.foodapp;

public class FoodFactory {

    public static FoodItem createFoodItem(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "pizza":
                return new Pizza(name, price);
            case "burger":
                return new Burger(name, price);
            default:
                throw new IllegalArgumentException("Неизвестный тип блюда: " + type);
        }
    }
}