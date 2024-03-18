package com.cts.cryptocurrency.controller;

import com.cts.cryptocurrency.model.CryptoCurrenciesList;
import com.cts.cryptocurrency.services.CryptoCurrencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cryptocurrencies")
public class CryptoCurrencyController {

    @Autowired
    private CryptoCurrencyService cryptoCurrencyService;

    @GetMapping
    public CryptoCurrenciesList getCryptoCurrencies() {
        return cryptoCurrencyService.getLatestCryptoCurrency();
    }
}
