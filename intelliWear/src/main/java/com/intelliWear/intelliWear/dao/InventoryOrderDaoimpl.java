package com.intelliWear.intelliWear.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;

import com.intelliWear.intelliWear.entities.InventoryOrder;

@Repository
public class InventoryOrderDaoimpl implements InventoryOrderDao {

	@Autowired
	org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	
	
	
	
	@Override
	public List<InventoryOrder>fetchinfoCo() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM intelliwear.inventoryorder", new BeanPropertyRowMapper<>(InventoryOrder.class));
	}
	
	
	@Override
	public InventoryOrder fetchInfoOrderCoCu(int order_id) {
        // SQL query to select inventory order by order_id
        String sql = "SELECT * FROM inventoryorder WHERE order_id = ?";
		return JdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(InventoryOrder.class),order_id);

        // Mapping SQL result to InventoryOrder class using BeanPropertyRowMapper
        //JdbcTemplate.queryF
    }


	@Override
	public int addInfoCo(InventoryOrder InventoryOrder) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO intelliwear.inventoryorder (Order_id,Product_id ,Quantity_ordered , Order_date, Delivery_date,Status) VALUES (?,?,?,?,?,?)";
		
		return JdbcTemplate.update(sql, InventoryOrder.getOrder_id(),InventoryOrder.getProduct_id(),InventoryOrder.getQuantity_ordered(),InventoryOrder.getOrder_date(),InventoryOrder.getDelivery_date(),InventoryOrder.getStatus());
	}
	
		

	@Override
	public int updateInfoCo(InventoryOrder InventoryOrder, int order_id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE intelliwear.inventoryorder SET product_id=?, quantity_ordered=?, order_date=?, delivery_date=?,status=? WHERE order_id = ?"; 
		return JdbcTemplate.update(sql, InventoryOrder.getProduct_id(),InventoryOrder.getQuantity_ordered(),InventoryOrder.getOrder_date(),InventoryOrder.getDelivery_date(),InventoryOrder.getStatus(), order_id);

	}


	@Override
	public int deleteInfoCo(int order_id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM intelliwear.inventoryorder WHERE order_id=?";
		return JdbcTemplate.update(sql, order_id);
	}


	

	


	
	
	
	
}
