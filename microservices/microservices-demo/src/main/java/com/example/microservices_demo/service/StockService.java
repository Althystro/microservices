package com.example.microservices_demo.service;

import com.example.microservices_demo.bo.CreateStockRequest;
import com.example.microservices_demo.bo.UpdateStockResponse;

public interface StockService {
    UpdateStockResponse updateStock(CreateStockRequest request);

    void addItems(CreateStockRequest stock);

}
