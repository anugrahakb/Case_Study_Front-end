package com.casestudy.cart.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.casestudy.cart.model.Cart;

public interface CartService {
	
    Optional<Cart> getCartById(String cartId);
	
	Cart updateCart(Cart cart);
	
	List<Cart> getAllCarts();
	
	Cart addCart(Cart cart);
	
	BigDecimal cartTotal(Cart cart);
	

}
