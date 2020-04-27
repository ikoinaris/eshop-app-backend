package com.ikoin.eshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ikoin.eshop.entity.Product;

/**
 * 
 * @author i.koinaris
 *
 */
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductRepository extends JpaRepository<Product, Long>{

}
