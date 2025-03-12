package org.example;

class OrderProcessing extends Thread {
    @Override
    public void run() {
        System.out.println("Order is being processed...");
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Order processed successfully!");
    }
}

class FoodPreparation extends Thread {
    @Override
    public void run() {
        System.out.println("Food is being prepared...");
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Food is ready!");
    }
}

class Delivery extends Thread {
    @Override
    public void run() {
        System.out.println("Delivery person picked up the order...");
        try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("Order delivered to the customer!");
    }
}


public class Main {
    public static void main(String[] args) {

        OrderProcessing order = new OrderProcessing();
        FoodPreparation food = new FoodPreparation();
        Delivery delivery = new Delivery();

        order.start();
        food.start();
        delivery.start();
    }
}