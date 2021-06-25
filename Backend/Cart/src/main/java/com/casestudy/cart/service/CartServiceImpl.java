package com.casestudy.cart.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.cart.model.Cart;
import com.casestudy.cart.repository.CartRepository;




public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	//@Autowired
	//private ItemRepository itemRepository;
	@Override
	public Optional<Cart> getCartById(String cartId) {
		
		return cartRepository.findById(cartId);
	}

	@Override
	public Cart updateCart(Cart cart) {
		
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getAllCarts() {
		
		return cartRepository.findAll();
	}

	@Override
	public Cart addCart(Cart cart) {
		
		return cartRepository.save(cart);
	}

	@Override
	public BigDecimal cartTotal(Cart cart) {
		
		return cart.getTotalPrice();
	}

}
