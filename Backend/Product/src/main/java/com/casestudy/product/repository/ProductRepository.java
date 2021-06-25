package com.casestudy.product.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.product.model.Product;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{

	List<Product> findByProductId(String productId);
	List<Product> findByProductName(String productName);
	List<Product> findByCategory(String category);
	Product deleteByProductId(String productId);
	Optional<Product> findById(String productId);


}