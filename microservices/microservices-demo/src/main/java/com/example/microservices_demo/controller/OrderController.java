//package com.example.microservices_demo.controller;
//
//import com.example.microservices_demo.bo.CreateStockRequest;
//import com.example.microservices_demo.bo.UpdateStockResponse;
//import com.example.microservices_demo.service.StockService;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class OrderController {
//    private final StockService stockService;
//
//    public OrderController(StockService stockService) {
//        this.stockService = stockService;
//    }
//
//    @PostMapping("/orders")
//    public UpdateStockResponse doOrder(@RequestBody CreateStockRequest customerOrder) {
//
//        return stockService.updateStock(customerOrder);
//    }
//}
