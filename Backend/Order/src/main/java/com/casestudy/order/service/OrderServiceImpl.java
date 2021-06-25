package com.casestudy.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.order.model.Order;
import com.casestudy.order.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
    public void addOrder(Order order) {
        this.orderRepository.save(order);
    }

    @Override
    public List<Order> findByOrderId(String orderId) {
        return this.orderRepository.findByOrderId(orderId);
    }

	

}
