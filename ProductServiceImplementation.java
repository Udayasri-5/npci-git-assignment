package com.product.assignment.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.assignment.entity.Product;
import com.product.assignment.entity.ProductCategory;
import com.product.assignment.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	private ProductRepository repository;

	
	public List<Product> getAllProducts() {
		
		return repository.getAllProducts();
	}

	
	public List<ProductCategory> getAllProductCatgeory() {
		
		return repository.getAllProductCatgeory();
	}

	
	public Product findProductByID(long productID) {
		
		return repository.findProductByID(productID);
	}

	
	public void deleteProductByID(long productID) {
		repository.deleteProductByID(productID);
		
	}
	
    
	public void saveOrUpdate(Product product) {
		repository.saveOrUpdate(product);
	}


}
