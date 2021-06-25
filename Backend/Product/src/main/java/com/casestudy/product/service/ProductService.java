package com.casestudy.product.service;

import java.util.List;

import com.casestudy.product.model.Product;

public interface ProductService {
	
    List<Product> getAllProducts();
	List<Product> getProductById(String productId);
	List<Product> getProductByName(String productName);
	List<Product> getProductByCategory(String category);
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Product deleteProductByProductId(String productId);

}