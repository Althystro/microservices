package com.example.microservices_demo.controller;

import com.example.microservices_demo.bo.AccountResponse;
import com.example.microservices_demo.bo.CreateStockRequest;
import com.example.microservices_demo.bo.UpdateStockResponse;
import com.example.microservices_demo.entity.StockEntity;
import com.example.microservices_demo.repository.StockRepository;
import com.example.microservices_demo.service.StockService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService stockService;
    private final StockRepository stockRepository;

    public StockController(StockService stockService, StockRepository stockRepository) {
        this.stockService = stockService;
        this.stockRepository = stockRepository;
    }

    @PostMapping("/addItems")
    public void addItems(@RequestBody CreateStockRequest stock) {
        stockService.addItems(stock);
    }

    @PostMapping("/updateStock")
    public UpdateStockResponse updateStock(@RequestBody CreateStockRequest request) {
        return stockService.updateStock(request);
    }

    @GetMapping("/account")
    public AccountResponse getAllStocksForAccount() {
        Iterable<StockEntity> stocks = stockRepository.findAll();

        AccountResponse response = new AccountResponse(stocks, "success");
        return response;
    }
}
