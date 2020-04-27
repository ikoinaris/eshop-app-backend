package com.ikoin.eshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.ikoin.eshop.entity.Product;
import com.ikoin.eshop.entity.ProductCategory;

/**
 * 
 * @author i.koinaris
 *
 */
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{

	
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions = {
				HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE
		};
		
		config.getExposureConfiguration().forDomainType(Product.class)
			.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
			.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		config.getExposureConfiguration().forDomainType(ProductCategory.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
	}

}
