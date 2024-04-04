package com.intelliWear.intelliWear.dao;

import java.util.List;
import com.intelliWear.intelliWear.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;



@Repository

public class SupplierServiceimpl implements SupplierDao {

	@Autowired
	JdbcTemplate JdbcTemplate;
	
	

	@Override
	public List<Suppliers>fetchinfoCo() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM intelliwear.supplier", new BeanPropertyRowMapper<>(Suppliers.class));
	}
	
	@Override
	public Suppliers fetchInfoSupplierCoCu(int supplier_id) {
		// TODO Auto-generated method stub
		return JdbcTemplate.queryForObject("SELECT * FROM intelliwear.supplier where supplier_id = ?", new BeanPropertyRowMapper<>(Suppliers.class),supplier_id);
	}


	@Override
	public int addInfoCo(Suppliers suppliers) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO intelliwear.supplier (supplier_id, supplier_name, contact_person, contact_number, email) VALUES (?,?,?,?,?)";
		
		return JdbcTemplate.update(sql, suppliers.getSupplier_id(),suppliers.getSupplier_name(),suppliers.getContact_person(),suppliers.getContact_number(),suppliers.getEmail());
	}
	


	@Override
	public int updateInfoCo(Suppliers suppliers, int supplier_id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE intelliwear.supplier SET supplier_name=?, contact_person=?, contact_number=?, email=? WHERE supplier_id = ?"; 
		return JdbcTemplate.update(sql,suppliers.getSupplier_name(),suppliers.getContact_person(),suppliers.getContact_number(), suppliers.getEmail(),supplier_id);
	}


	@Override
	public int deleteInfoCo(int supplier_id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM intelliwear.supplier WHERE supplier_id=?";
		return JdbcTemplate.update(sql, supplier_id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
