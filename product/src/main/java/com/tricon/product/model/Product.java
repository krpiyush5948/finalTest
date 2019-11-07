package com.tricon.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="price")
	private double price;
	
	@Column(name="product_description")
	private String productDescription;
	
	@Column(name="product_weight")
	private float productWeight;
	
	@Column(name="is_deleted")
	private boolean isDeleted;

	/**
	 * @param id
	 * @param productName
	 * @param price
	 * @param productDescription
	 * @param productWeight
	 * @param isDeleted
	 */
	public Product(int id, String productName, double price, String productDescription, float productWeight,
			boolean isDeleted) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.productWeight = productWeight;
		this.isDeleted = isDeleted;
	}


	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	/**
	 * @param id
	 * @param productName
	 * @param price
	 * @param productDescription
	 * @param productWeight
	 */
	public Product(int id, String productName, double price, String productDescription, float productWeight) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.productWeight = productWeight;
	}
	

	/**
	 * 
	 */
	public Product() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(float productWeight) {
		this.productWeight = productWeight;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", productDescription="
				+ productDescription + ", productWeight=" + productWeight + "]";
	}
	
   
}
