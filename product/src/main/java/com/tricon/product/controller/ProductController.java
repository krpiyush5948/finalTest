package com.tricon.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.product.model.Product;
import com.tricon.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/**
	 * getting the product 
	 */
	@GetMapping("product/get")
	List<Product> getAllProduct(@RequestParam(defaultValue="0") Integer pageNo,
			@RequestParam(defaultValue="3") Integer pageSize,
            @RequestParam(defaultValue = "id")String sortBy){
		return productService.getAllProduct(pageNo,pageSize,sortBy);
	}
	
	/**
	 * adding the product
	 * @param product
	 */
	@PostMapping("product/add")
	void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	
}
