package com.intelliWear.intelliWear.dao;

import java.util.List;


import com.intelliWear.intelliWear.entities.*;

public interface StockDao {

	public List<Stock> fetchinfoCo();

	public Stock fetchInfoStockCoCu(int product_id);

	public int addInfoCo(Stock stock);

	public int updateInfoCo(Stock stock, int product_id);

	public int deleteInfoCo(int product_id);
	
	public List<Stock> sort_price_hl();
	
	public List<Stock> sort_price_lh();
	
	public List<Stock> sort_quantity_lh();

	public List<Stock> sort_quantity_hl();

	
	public List<Stock> filter_price_lhu();

	public List<Stock> filter_price_mhu();
	
	public List<Stock> filter_quantity_lhu();
	
	public List<com.intelliWear.intelliWear.entities.Stock> filter_quantity_mhu();
	
	
	public List<Stock> filter_watch();
	
	public List<Stock> filter_tracker();
	
	public List<Stock> filter_glasses();

	public int findWarehouseIdByProductId(int product_id);

	public Warehouse findWarehouseByWarehouseId(int warehouse_id);

	int findProductIdByOrderId(int order_id);

	Stock findProductByProductId(int product_id);
	
}
