package com.casestudy.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.order.model.Cart;
import com.casestudy.order.model.Order;
import com.casestudy.order.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	@GetMapping("/demo")
	public String demo() {
		return "Order is working";
	}
	
	@Autowired
	private OrderRepository orderRepository;
	
//	@Autowired
//	private OrderServiceImpl orderServiceImpl;
	
	@GetMapping("/allorders")
	public List<Order> getAllOrders() {
		
		return orderRepository.findAll();
	}
	@PutMapping("/placeorder")
	public Object placeOrder(Cart cart) {
		
		return orderRepository.save(cart);
	}
	@DeleteMapping("/deleteorder/{orderId}")
	public void deleteOrder(@PathVariable String orderId) {
		
		orderRepository.deleteById(orderId);
	}
	@GetMapping("/{customerId}")
	public List<Order> getOrderByCustomerId(@PathVariable Integer customerId) {

		return orderRepository.findByCustomerId(customerId);
	}
	/*@PutMapping("/changeStatus/{orderId} ")
	public String changeStatus(@PathVariable String orderId) {
	
		  orderServiceImpl.changeStatus(orderId);
		return "Order Status is updated";
	}*/

}
