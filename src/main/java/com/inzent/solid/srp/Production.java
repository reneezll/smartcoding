package com.inzent.solid.srp;

//한 클래스는 하나의 책임을 가져야 한다.
//        SRP가 지켜지지 않은 코드
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

