package com.intelliWear.intelliWear.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.intelliWear.intelliWear.entities.Warehouse;

@Repository
public class WarehouseDaoimpl implements WarehouseDao {

	@Autowired
	org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	
	
	
	
	@Override
	public List<Warehouse>fetchinfoCo() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM intelliwear.warehouse", new BeanPropertyRowMapper<>(Warehouse.class));
	}
	
	@Override
	public Warehouse fetchInfoWarehouseCoCu(int warehouse_id) {
		// TODO Auto-generated method stub
		return JdbcTemplate.queryForObject("SELECT * FROM intelliwear.warehouse WHERE warehouse_id = ?", new BeanPropertyRowMapper<>(Warehouse.class),warehouse_id);
	}


	@Override
	public int addInfoCo(Warehouse Warehouse) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO intelliwear.warehouse (warehouse_id,warehouse_name ,location , capacity) VALUES (?,?,?,?)";
		
		return JdbcTemplate.update(sql, Warehouse.getWarehouse_id(),Warehouse.getWarehouse_name(),Warehouse.getLocation(),Warehouse.getCapacity());
	}
	


	@Override
	public int updateInfoCo(Warehouse Warehouse, int warehouse_id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE intelliwear.warehouse SET warehouse_name=?, location=?, capacity=? WHERE warehouse_id = ?"; 
		return JdbcTemplate.update(sql, Warehouse.getWarehouse_name(),Warehouse.getLocation(),Warehouse.getCapacity(), warehouse_id);

	}


	@Override
	public int deleteInfoCo(int warehouse_id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM intelliwear.warehouse WHERE warehouse_id=?";
		return JdbcTemplate.update(sql, warehouse_id);
}
}
