package com.casestudy.order.service;

import java.util.List;

import com.casestudy.order.model.Order;

public interface OrderService {
	
	void  addOrder(Order order);
    List<Order> findByOrderId(String orderId);


}
