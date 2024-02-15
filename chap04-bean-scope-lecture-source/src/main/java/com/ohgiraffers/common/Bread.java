package com.ohgiraffers.common;

import java.util.Date;

public class Bread extends Product{
    private java.util.Date bakedDate;   // 생산 시간

    public Bread() {
    }

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "bakedDate=" + bakedDate +
                "} " + super.toString();
    }
}
