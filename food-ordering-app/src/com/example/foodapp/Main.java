package com.example.foodapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск приложения Food Ordering...");

        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        DbInitializer.initializeDatabase(dbConnection);

        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();

        FoodItem pizza = FoodFactory.createFoodItem("pizza", "Маргарита", 10.99);
        FoodItem burger = FoodFactory.createFoodItem("burger", "Чизбургер", 5.49);

        Order order = orderService.createOrder(pizza, burger);

        System.out.println("Сформирован заказ. Список блюд:");
        order.getItems().forEach(item ->
                System.out.println(item.getDescription() + " - " + item.getPrice() + " USD")
        );

        System.out.println("Общая стоимость заказа: " + order.getTotalPrice() + " USD");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите метод оплаты (cash/card): ");
        String paymentMethod = scanner.nextLine();

        paymentService.pay(order, paymentMethod);

        System.out.println("Приложение завершило работу.");
    }
}