package com.tricon.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.customer.model.Customer;
import com.tricon.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("customer/get")
	public List<Customer> getCustomer() {
		return customerService.getCustomer();

	}

	/**
	 * pagination.
	 * @param name
	 * @return
	 */
	
	@GetMapping("customer")
	public List<Customer> getCustomerPagination(@RequestParam(defaultValue="0")Integer pageNo,
												@RequestParam(defaultValue = "5")Integer pageSize,
												@RequestParam(defaultValue = "id")String sortBy) {
		return customerService.getCustomerPagination(pageNo,pageSize,sortBy);

	}
	/*
	 * find the customer by name
	 * 
	 * @param customer
	 */
	@GetMapping("customer/{name}")
	public Customer getCustomerByName(@PathVariable String name) {
		return customerService.getCustomerByName(name);
	}

	/**
	 * find the customer by id.
	 * 
	 * @param customer
	 */
	@GetMapping("cust/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

	/**
	 * this function add the customer object.
	 * 
	 * @param customer
	 */
	@PostMapping("customer/add")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
}
