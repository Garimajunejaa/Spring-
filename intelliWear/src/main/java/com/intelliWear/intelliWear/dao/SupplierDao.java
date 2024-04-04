package com.intelliWear.intelliWear.dao;

import java.util.List;

import com.intelliWear.intelliWear.entities.Suppliers;

public interface SupplierDao {

	public List<Suppliers> fetchinfoCo();

	public Suppliers fetchInfoSupplierCoCu(int supplier_id);

	public int addInfoCo(Suppliers suppliers);

	public int updateInfoCo(Suppliers suppliers, int supplier_id);

	public int deleteInfoCo(int supplier_id);
}
