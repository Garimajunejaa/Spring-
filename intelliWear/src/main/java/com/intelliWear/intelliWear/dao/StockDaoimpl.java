package com.intelliWear.intelliWear.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.intelliWear.intelliWear.entities.Stock;
import com.intelliWear.intelliWear.entities.Warehouse;


@Repository
public class StockDaoimpl implements StockDao {

	@Autowired
	org.springframework.jdbc.core.JdbcTemplate JdbcTemplate;
	
	
	
	
	
	@Override
	public List<Stock>fetchinfoCo() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM intelliwear.productstock", new BeanPropertyRowMapper<>(Stock.class));
	}
	
	@Override
	public Stock fetchInfoStockCoCu(int product_id) {
		// TODO Auto-generated method stub
		return JdbcTemplate.queryForObject("SELECT * FROM intelliwear.productstock where product_id = ?", new BeanPropertyRowMapper<>(Stock.class),product_id);
	}


	@Override
	public int addInfoCo(Stock stock) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO intelliwear.productstock (product_id,product_name ,description , unit_price, stock_quantity,warehouse_id) VALUES (?,?,?,?,?,?)";
		
		return JdbcTemplate.update(sql, stock.getProduct_id(),stock.getProduct_name(),stock.getDescription(),stock.getUnit_price(),stock.getStock_quantity(),stock.getWarehouse_id());
	}
	


	@Override
	public int updateInfoCo(Stock stock, int product_id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE intelliwear.productstock SET product_name=?, description=?, unit_price=?, stock_quantity=?,warehouse_id=? WHERE product_id = ?"; 
		return JdbcTemplate.update(sql,stock.getProduct_name(),stock.getDescription(),stock.getUnit_price(),stock.getStock_quantity(),stock.getWarehouse_id(),product_id);

	}


	@Override
	public int deleteInfoCo(int product_id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM intelliwear.productstock WHERE product_id=?";
		return JdbcTemplate.update(sql, product_id);
}

	@Override
	public List<Stock> sort_price_hl() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock ORDER BY unit_price DESC;", new BeanPropertyRowMapper<>(Stock.class));

	}
	@Override

	public List<Stock> sort_price_lh() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock ORDER BY unit_price ASC;", new BeanPropertyRowMapper<>(Stock.class));

	}
	@Override

	public List<Stock> sort_quantity_lh() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock ORDER BY stock_quantity ASC;", new BeanPropertyRowMapper<>(Stock.class));

	}
	
	@Override
	public List<Stock> sort_quantity_hl() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock ORDER BY stock_quantity DESC;", new BeanPropertyRowMapper<>(Stock.class));

	}

	@Override
	public List<Stock> filter_price_lhu() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE unit_price < 100 ;", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public List<Stock> filter_price_mhu() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE unit_price > 100;", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public List<Stock> filter_quantity_lhu() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE stock_quantity <= 100;", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public List<Stock> filter_quantity_mhu() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE stock_quantity > 100;", new BeanPropertyRowMapper<>(Stock.class));
	}

	

	@Override
	public List<Stock> filter_watch() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE product_name LIKE '%smartwatch%';", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public List<Stock> filter_tracker() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE product_name LIKE '%tracker%';", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public List<Stock> filter_glasses() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query("SELECT * FROM productstock WHERE product_name LIKE '%glasses%';", new BeanPropertyRowMapper<>(Stock.class));
	}

	@Override
	public int findWarehouseIdByProductId(int product_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT warehouse_id FROM productstock WHERE product_id = ?";
        return JdbcTemplate.queryForObject(sql, Integer.class, product_id);
	}

	@Override
	public Warehouse findWarehouseByWarehouseId(int warehouse_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM warehouse WHERE warehouse_id = ?";
		
        return JdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Warehouse.class), warehouse_id);
	}
	
	
	@Override
	public int findProductIdByOrderId(int order_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT product_id FROM inventoryorder WHERE order_id = ?";
        return JdbcTemplate.queryForObject(sql, Integer.class, order_id);
	}

	@Override
	public Stock findProductByProductId(int product_id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM productstock WHERE product_id = ?";
		
        return JdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Stock.class), product_id);
	}
	
	
	
	
	
	
	






}
