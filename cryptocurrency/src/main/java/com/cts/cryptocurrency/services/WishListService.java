package com.cts.cryptocurrency.services;

import com.cts.cryptocurrency.exceptions.WishListAlreadyExistException;
import com.cts.cryptocurrency.model.CryptoCurrency;

import java.util.List;

public interface WishListService {
    CryptoCurrency saveWishList(CryptoCurrency cryptoCurrency) throws WishListAlreadyExistException;
    List<CryptoCurrency> getsWishList();
    void deleteWishListById(String id);
    CryptoCurrency updateWishList(CryptoCurrency cryptoCurrency);
}
