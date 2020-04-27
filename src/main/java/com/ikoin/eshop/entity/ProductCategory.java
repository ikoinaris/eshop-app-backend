package com.ikoin.eshop.entity;

import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

//import lombok.Data;

/**
 * 
 * @author i.koinaris
 *
 */

@Entity
@Table(name = "product_category")
//@Data
@Getter
@Setter
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Product> products;
	
	

}
