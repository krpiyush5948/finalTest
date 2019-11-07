package com.tricon.order.model;

import java.util.Optional;

public class OrderDetails {
	
	private Customer customer;
	private Optional<Order> order;
	public OrderDetails(Customer customer2, Optional<Order> order) {
		
		// TODO Auto-generated constructor stub
		this.customer = customer2;
		this.order = order;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Optional<Order> getOrder() {
		return order;
	}
	public void setOrder(Optional<Order> order) {
		this.order = order;
	}

}
