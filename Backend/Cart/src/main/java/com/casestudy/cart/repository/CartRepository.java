package com.casestudy.cart.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.cart.model.Cart;

public interface CartRepository extends MongoRepository<Cart,String> {

}
