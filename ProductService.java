package com.product.assignment.service;

import java.util.List;

import com.product.assignment.entity.Product;
import com.product.assignment.entity.ProductCategory;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public List<ProductCategory> getAllProductCatgeory();
	public Product findProductByID(long productID);
	public void deleteProductByID(long productID);
	public void updateProductByID(Product product);
	public void insertProduct(Product product);

}
