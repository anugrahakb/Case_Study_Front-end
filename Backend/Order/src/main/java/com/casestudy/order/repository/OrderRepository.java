package com.casestudy.order.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.order.model.Cart;
import com.casestudy.order.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

	Order save(Cart cart);

	List<Order> findByCustomerId(Integer customerId);

	List<Order> findByOrderId(String orderId);

}
