package com.tricon.customer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestParam;

import com.tricon.customer.dao.CustomerDao;
import com.tricon.customer.model.Customer;

@org.springframework.stereotype.Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerDao.findAll();
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	/**
	 * return customer by name
	 * 
	 * @param name
	 * @return
	 */
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerDao.findByName(name);
	}

	/**
	 * return customer by its id.
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Customer> getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}

	/**
	 * 
	 * @param pageNo
	 * @return
	 */
	public List<Customer> getCustomerPagination(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "5") Integer pageSize, @RequestParam(defaultValue = "id") String sortBy) {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

		Page<Customer> pageResult = customerDao.findAll(pageable);

		if (pageResult.hasContent()) {
			return pageResult.getContent();
		} else {
			return new ArrayList<Customer>();
		}
	}
}