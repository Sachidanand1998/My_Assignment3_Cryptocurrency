package com.cts.cryptocurrency.services;

import com.cts.cryptocurrency.model.CryptoCurrenciesList;

public interface CryptoCurrencyService {
    CryptoCurrenciesList getLatestCryptoCurrency();
}