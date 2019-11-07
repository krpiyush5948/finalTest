package com.tricon.order.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_details")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="Customer_id")
	private Integer CustomerId;
	
	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="order_placed_date")
	private String orderPlaceDate;
	
	@Column(name="amount")
	private Long amount;
	/**
	 * @param id
	 * @param customerId
	 * @param productId
	 * @param orderPlaceDate
	 * @param amount
	 */
	public Order(int id, Integer customerId, Integer productId, String orderPlaceDate, Long amount) {
		super();
		this.id = id;
		CustomerId = customerId;
		this.productId = productId;
		this.orderPlaceDate = orderPlaceDate;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getOrderPlaceDate() {
		return orderPlaceDate;
	}
	public void setOrderPlaceDate(String orderPlaceDate) {
		this.orderPlaceDate = orderPlaceDate;
	}
	public Long getAmount() {
		return amount;
	}
	/**
	 * 
	 */
	public Order() {
		super();
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
}
