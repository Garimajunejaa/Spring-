package com.intelliWear.intelliWear.dao;

import java.util.List;

import com.intelliWear.intelliWear.entities.*;

public interface WarehouseDao {

	public List<Warehouse> fetchinfoCo();

	public Warehouse fetchInfoWarehouseCoCu(int warehouse_id);

	public int addInfoCo(Warehouse Warehouse);

	public int updateInfoCo(Warehouse Warehouse, int warehouse_id);

	public int deleteInfoCo(int warehouse_id);
}
