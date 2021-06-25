package com.casestudy.cart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.cart.model.Items;

public interface ItemRepository extends MongoRepository<Items, String>{

}
