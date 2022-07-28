package com.product.assignment.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.assignment.entity.Product;
import com.product.assignment.entity.ProductCategory;
import com.product.assignment.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/productList")
	public List<Product> getAllProducts(){
		return productservice.getAllProducts();
	}
	
	@GetMapping("/categoryList")
	public List<ProductCategory> getAllProductCatgeory(){
		return productservice.getAllProductCatgeory();
	}
	
	
	
	

}
