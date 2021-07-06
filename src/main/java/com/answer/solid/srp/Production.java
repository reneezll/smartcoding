package com.answer.solid.srp;

public class Production {

    private String name;
    private int price;

    public Production(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(int price) {
        this.price = price;
    }
}

