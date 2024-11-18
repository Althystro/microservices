package com.example.microservices_demo.bo;

public class UpdateStockResponse {

    private String item;

    private Long quantity;

    private String status;

    private Long orderId;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getRemainingQty() {
        return quantity;
    }

    public void setRemainingQty(Long remainingQty) {
        this.quantity = remainingQty;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}