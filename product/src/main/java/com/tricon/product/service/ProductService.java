package com.tricon.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tricon.product.dao.ProductDao;
import com.tricon.product.model.Product;

@Service
public class ProductService {

	
	@Autowired
	private ProductDao productDao;
	/**
	 * this function add product into the database.
	 * @param product
	 */
	public void addProduct(Product product) {
		productDao.save(product);
	}
	/**
	 * this function returns list of product.
	 * @return
	 */
	public List<Product> getAllProduct( Integer pageNo,Integer pageSize,String sortBy) {
		// TODO Auto-generated method stub
		Pageable pageable= PageRequest.of(pageNo, pageSize,Sort.by(sortBy));
		Page<Product> pageResult= productDao.findAll(pageable);
		
		if(pageResult.hasContent())
			return pageResult.getContent();
		else {
			return new ArrayList<Product>();
		}
	}

}




