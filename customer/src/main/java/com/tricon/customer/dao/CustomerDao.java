package com.tricon.customer.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tricon.customer.model.Customer;

@Repository
public interface CustomerDao extends PagingAndSortingRepository<Customer,Integer> {

	Customer findByName(String name);

	

}
