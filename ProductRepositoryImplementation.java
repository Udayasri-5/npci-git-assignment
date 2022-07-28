package com.product.assignment.repository;

import java.util.List;



import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.product.assignment.entity.Product;
import com.product.assignment.entity.ProductCategory;

@Repository
public class ProductRepositoryImplementation implements ProductRepository {
	
	@Autowired
	EntityManager entityManager;

	
	public List<Product> getAllProducts() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Product> query = currentSession.createQuery("select p from Product p",Product.class);
		
		List<Product> productList = query.getResultList();
		
		return productList;
	}

	
	public List<ProductCategory> getAllProductCatgeory() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<ProductCategory> query = currentSession.createQuery("select c from ProductCategory c",ProductCategory.class);
		
		List<ProductCategory> productCategoryList = query.getResultList();
		
		return productCategoryList;
	}

	
	public Product findProductByID(long productID) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class,productID);
	}

	@Transactional
	public void deleteProductByID(long productID) {
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from product where productid = :productId");
		query.setParameter("productId",productID );
		query.executeUpdate();
		
	}  

	@Transactional
	public void updateProductByID(Product product) {
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.update(product);

		
	}

	@Transactional
	public void insertProduct(Product product) {
		
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.save(product);
		
	}

}
