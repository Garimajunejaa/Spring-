package com.intelliWear.intelliWear.entities;

public class Stock {

	private int product_id;
	private String product_name;
	private String description;
	private double unit_price;
	private int stock_quantity;
	private int warehouse_id;
	public Stock(int product_id, String product_name, String description, double unit_price, int stock_quantity,
			int warehouse_id) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.description = description;
		this.unit_price = unit_price;
		this.stock_quantity = stock_quantity;
		this.warehouse_id = warehouse_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stock [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", unit_price=" + unit_price + ", stock_quantity=" + stock_quantity + ", warehouse_id=" + warehouse_id
				+ "]";
	}
	
	
}
