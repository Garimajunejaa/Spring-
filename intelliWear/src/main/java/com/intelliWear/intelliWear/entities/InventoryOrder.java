package com.intelliWear.intelliWear.entities;

public class InventoryOrder {

	
	private int order_id;
	private int product_id;
	private int quantity_ordered;
	private String order_date;
	private String delivery_date;
	private String status;
	public InventoryOrder(int order_id, int product_id, int quantity_ordered, String order_date, String delivery_date,
			String status) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.quantity_ordered = quantity_ordered;
		this.order_date = order_date;
		this.delivery_date = delivery_date;
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity_ordered() {
		return quantity_ordered;
	}
	public void setQuantity_ordered(int quantity_ordered) {
		this.quantity_ordered = quantity_ordered;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public InventoryOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InventoryOrder [order_id=" + order_id + ", product_id=" + product_id + ", quantity_ordered="
				+ quantity_ordered + ", order_date=" + order_date + ", delivery_date=" + delivery_date + ", status="
				+ status + "]";
	}
	
	
}
