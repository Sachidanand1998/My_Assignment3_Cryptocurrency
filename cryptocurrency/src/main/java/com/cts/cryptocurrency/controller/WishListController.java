package com.cts.cryptocurrency.controller;

import com.cts.cryptocurrency.model.CryptoCurrency;
import com.cts.cryptocurrency.services.WishListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wishlist")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping
    public CryptoCurrency saveWishList(@RequestBody CryptoCurrency cryptoCurrency) {
        return wishListService.saveWishList(cryptoCurrency);
    }

    @GetMapping
    public List<CryptoCurrency> getsWishList() {
        return wishListService.getsWishList();
    }

    @DeleteMapping("/{id}")
    public void deleteWishListById(@PathVariable String id) {
        wishListService.deleteWishListById(id);

    }

    @PutMapping
    public CryptoCurrency updateWishList(@RequestBody CryptoCurrency cryptoCurrency) {
        return wishListService.updateWishList(cryptoCurrency);
    }
}
