package com.intelliWear.intelliWear.entities;

public class Suppliers {

	private   int supplier_id;
	private String supplier_name;
	private   String contact_person;
	private   String contact_number;
	private   String email;
	
	
	public Suppliers(int supplier_id, String supplier_name, String contact_person, String contact_number,
			String email) {
		super();
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.contact_person = contact_person;
		this.contact_number = contact_number;
		this.email = email;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getContact_person() {
		return contact_person;
	}

	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Suppliers() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Suppliers [supplier_id=" + supplier_id + ", supplier_name=" + supplier_name + ", contact_person="
				+ contact_person + ", contact_number=" + contact_number + ", email=" + email + "]";
	}
	
	
	
	
	
}
	