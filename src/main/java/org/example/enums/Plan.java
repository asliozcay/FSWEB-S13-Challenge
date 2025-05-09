package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 15),
    PRO("Pro Plan", 30),
    PREMIUM("Premium Plan", 45);
    private String name;
    private int price;
    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

