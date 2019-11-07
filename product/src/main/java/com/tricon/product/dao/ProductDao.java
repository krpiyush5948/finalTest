package com.tricon.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tricon.product.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

}
