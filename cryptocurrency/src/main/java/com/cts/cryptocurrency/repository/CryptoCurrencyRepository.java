package com.cts.cryptocurrency.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.cryptocurrency.model.CryptoCurrency;

@Repository
public interface CryptoCurrencyRepository extends CrudRepository<CryptoCurrency, String> {

}