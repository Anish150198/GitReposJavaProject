package com.lti.demo;

public class Product {
	private int id;
	private String prodName;
	private float cost;
	public Product(int id, String prodName, float cost) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", cost=" + cost + "]";
	}
	
	
	
	
	

}
