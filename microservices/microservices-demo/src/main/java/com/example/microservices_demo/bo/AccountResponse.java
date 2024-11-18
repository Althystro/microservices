package com.example.microservices_demo.bo;

import com.example.microservices_demo.entity.StockEntity;

public class AccountResponse {
    private Iterable<StockEntity> stocks;
    private String status;

    // Constructors, Getters, and Setters
    public AccountResponse() {
    }

    public AccountResponse(Iterable<StockEntity> stocks, String status) {
        this.stocks = stocks;
        this.status = status;
    }

    public Iterable<StockEntity> getStocks() {
        return stocks;
    }

    public void setStocks(Iterable<StockEntity> stocks) {
        this.stocks = stocks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
