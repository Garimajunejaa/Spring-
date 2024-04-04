package com.intelliWear.intelliWear.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelliWear.intelliWear.dao.*;
import com.intelliWear.intelliWear.entities.*;


@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

	@Autowired
	private WarehouseDao WarehouseDao;
	
	
	//CRUD OPERATIONS ON SUPPLIER TABLE 
	
	//get the flight
		@GetMapping("/allwarehouse")
		public List<Warehouse> fetchinfoCo()
		{
			return WarehouseDao.fetchinfoCo();
			
		} 
		
		@GetMapping("/warehouse/{warehouse_id}")
		public Warehouse fetchInfoSupplierCoCu(@PathVariable int warehouse_id) 
		{
			return WarehouseDao.fetchInfoWarehouseCoCu(warehouse_id);
			
		}
		
		@PostMapping("/warehouse")
		public String addInfoCo(@RequestBody Warehouse Warehouse) 
		{
			int result = WarehouseDao.addInfoCo(Warehouse);
			if (result == 1) {return "Success";}
			else return "Failure";
		}
		
		@PutMapping("/warehouse/{warehouse_id}")
		public String updateInfoCo(@RequestBody Warehouse Warehouse, @PathVariable int warehouse_id) 
		{
				
			int result = WarehouseDao.updateInfoCo(Warehouse,warehouse_id);
			if (result == 1) {return "Success";}
			else return "Failure";
				
		}
		
		@DeleteMapping("/warehouse/{warehouse_id}")
		public String deleteInfoCo(@PathVariable int warehouse_id) 
		{
			int result = WarehouseDao.deleteInfoCo(warehouse_id);
			if (result == 1) {return "SUCCESS";}
			else return "FAILURE";
		}
}
