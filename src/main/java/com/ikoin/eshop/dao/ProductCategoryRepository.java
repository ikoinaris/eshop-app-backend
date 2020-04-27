package com.ikoin.eshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikoin.eshop.entity.ProductCategory;

/**
 * 
 * @author i.koinaris
 *
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
