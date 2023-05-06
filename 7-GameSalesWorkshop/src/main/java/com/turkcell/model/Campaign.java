package com.turkcell.model;

public class Campaign {
    private int id;
    private String name;
    private double discountRate;

    public Campaign() {
    }

    public Campaign(int id, String name, double discountRate) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discountRate;
    }

    public void setDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
}
