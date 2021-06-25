package com.casestudy.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.cart.model.Cart;
import com.casestudy.cart.repository.CartRepository;

@RestController
@RequestMapping("/cart")
public class CartController {
	@GetMapping("/demo")
	public String demo() {
		return "Cart is working";
	}
	
	@Autowired
	private CartRepository cartRepository;
	
	@GetMapping("/allcarts")
	public List<Cart> getAllCarts() {
		
		return cartRepository.findAll();
		
	}
	@GetMapping("/{cartId}")
	public Optional<Cart> getCartById(@PathVariable String cartId) {
		
		return cartRepository.findById(cartId);
		
	}
	@PostMapping("/addcart")
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
		
	}
	@PutMapping("/updatecart")
	public Cart updateCart(Cart cart) {
			
		return cartRepository.save(cart);
		
	}

}
