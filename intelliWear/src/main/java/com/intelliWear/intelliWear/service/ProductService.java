package com.intelliWear.intelliWear.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliWear.intelliWear.dao.*;
import com.intelliWear.intelliWear.entities.Stock;
import com.intelliWear.intelliWear.entities.Warehouse;

@Service
public class ProductService {

	@Autowired
	private StockDao StockDao ;

	
  

    public Warehouse getWarehouseInfoByProductId(int product_id) {
        // First, gets the warehouse_id for the given product_id
        int warehouse_id = StockDao.findWarehouseIdByProductId(product_id);

        // Now, use the warehouse_id to fetch warehouse information
        return StockDao.findWarehouseByWarehouseId(warehouse_id);
    }
    
    public Stock getProductInfoInfoByOrderId(int order_id) {
        // First, gets the warehouse_id for the given product_id
        int product_id = StockDao.findProductIdByOrderId(order_id);

        // Now, use the warehouse_id to fetch warehouse information
        return StockDao.findProductByProductId(product_id);
    }
}
