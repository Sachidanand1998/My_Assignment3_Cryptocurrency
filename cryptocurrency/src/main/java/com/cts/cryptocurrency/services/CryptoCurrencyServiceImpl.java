package com.cts.cryptocurrency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cts.cryptocurrency.model.CryptoCurrenciesList;

@Service
public class CryptoCurrencyServiceImpl implements CryptoCurrencyService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${API_BASE_URL}")
    private String API_BASE_URL;

    @Override
    public CryptoCurrenciesList getLatestCryptoCurrency() {
        System.out.println("API_BASE_URL: " + API_BASE_URL);
        return restTemplate.getForObject(
                UriComponentsBuilder.fromHttpUrl(API_BASE_URL + "cryptocurrencies").toUriString(),
                CryptoCurrenciesList.class);
    }
}