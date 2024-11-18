package com.example.account_mircoservices_demo.bo;

public class Stock {
    private String item;
    private int quantity;

    // Constructors, Getters, and Setters
    public Stock() {
    }

    public Stock(String item, int remainingQuantity) {
        this.item = item;
        this.quantity = remainingQuantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
