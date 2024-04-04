package com.intelliWear.intelliWear.dao;

import java.util.List;

import com.intelliWear.intelliWear.entities.InventoryOrder;


public interface InventoryOrderDao {

	public List<InventoryOrder> fetchinfoCo();

	public InventoryOrder fetchInfoOrderCoCu(int order_id);

	public int addInfoCo(InventoryOrder InventoryOrder);

	public int updateInfoCo(InventoryOrder InventoryOrder, int order_id);

	public int deleteInfoCo(int order_id);

	

	

	
}
