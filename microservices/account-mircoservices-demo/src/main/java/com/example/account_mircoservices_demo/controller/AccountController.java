package com.example.account_mircoservices_demo.controller;

import com.example.account_mircoservices_demo.bo.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    String stockServiceUrl = "http://localhost:8080/api/account";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public AccountResponse getAllStocks() {

        return restTemplate.getForObject(stockServiceUrl, AccountResponse.class);

    }


}

