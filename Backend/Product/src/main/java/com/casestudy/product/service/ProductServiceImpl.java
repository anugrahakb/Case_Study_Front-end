package com.casestudy.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.product.model.Product;
import com.casestudy.product.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	@Override
	public List<Product> getProductById(String productId) {
		return productRepository.findByProductId(productId);
	}
	
	@Override
	public List<Product> getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}
	
	@Override
	public List<Product> getProductByCategory(String category){
		return productRepository.findByCategory(category);
	}
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public Product deleteProductByProductId(String productId) {
		return productRepository.deleteByProductId(productId);
	}

}


