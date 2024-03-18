package com.cts.cryptocurrency.services;

import com.cts.cryptocurrency.repository.WishListRepository;
import com.cts.cryptocurrency.exceptions.WishListAlreadyExistException;
import com.cts.cryptocurrency.model.CryptoCurrency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListServiceImpl implements WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    @Override
    public CryptoCurrency saveWishList(CryptoCurrency cryptoCurrency) throws WishListAlreadyExistException {

        if (wishListRepository.existsById(cryptoCurrency.getId())) {
            throw new WishListAlreadyExistException("WishList already exist");
        }
        return wishListRepository.save(cryptoCurrency);
    }

    @Override
    public List<CryptoCurrency> getsWishList() {
        return (List<CryptoCurrency>) wishListRepository.findAll();
    }

    @Override
    public void deleteWishListById(String id) {
        wishListRepository.deleteById(id);
    }

    @Override
    public CryptoCurrency updateWishList(CryptoCurrency cryptoCurrency) {
        return wishListRepository.save(cryptoCurrency);
    }
}