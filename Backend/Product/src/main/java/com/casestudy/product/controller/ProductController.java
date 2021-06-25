package com.casestudy.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.product.repository.ProductRepository;
import com.casestudy.product.model.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	
	@GetMapping("/demo")
	public String demo() {
		return "Product is working";
	}
	
	@Autowired 
	private ProductRepository productRepository;
	
	//to get all products
	@GetMapping("/allproducts")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	//to get the products by productid
	@GetMapping("/productid/{prodcutId}")
	public Optional<Product> getProductById(@PathVariable String productId) {
		return productRepository.findById(productId);
	}
	
	//to get the products by productname
	@GetMapping("/productname/{productName}")
	public List<Product> getProductByName(@PathVariable String productName) {
		return productRepository.findByProductName(productName);
	}
	
	//to get the products by product category
	@GetMapping("/category/{category}")
	public List<Product> getProductByCategory(@PathVariable String category){
		return productRepository.findByCategory(category);
	}
	
	//admin can add the products
	@PostMapping("/admin/addProduct")
	public String addProduct(@RequestBody Product product) {
		productRepository.save(product);
		return "A new product is added";
	}
	
	//admin can update the product details
	@PutMapping("/admin/updateproduct")
	public String updateProduct(Product product) {
		productRepository.save(product);
		return "A existing product is updated";
	}
	
	//admin can delete the products
	@DeleteMapping("/admin/deleteproduct/{productId}")
	public String deleteProductByProductId(@PathVariable String productId) {
		productRepository.deleteByProductId(productId);
		return "Product Deleted with a Product Id " + productId;
	}

}
