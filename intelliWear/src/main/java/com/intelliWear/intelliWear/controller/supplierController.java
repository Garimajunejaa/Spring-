package com.intelliWear.intelliWear.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.intelliWear.intelliWear.entities.*;
import com.intelliWear.intelliWear.dao.*;

@RestController
@RequestMapping("/supplier")
public class supplierController {

	@Autowired
	private SupplierDao SupplierDao;
	
	
	//CRUD OPERATIONS ON SUPPLIER TABLE
	
	//get the flight
		@GetMapping("/allsupplier")
		public List<Suppliers> fetchinfoCo()
		{
			return SupplierDao.fetchinfoCo();
			
		} 
		
		@GetMapping("/supplier/{supplier_id}")
		public Suppliers fetchInfoSupplierCoCu(@PathVariable int supplier_id) 
		{
			return SupplierDao.fetchInfoSupplierCoCu(supplier_id);
			
		}
		
		@PostMapping("/supplier")
		public String addInfoCo(@RequestBody Suppliers suppliers) 
		{
			int result = SupplierDao.addInfoCo(suppliers);
			if (result == 1)
			{
				return "Success";
			}
			else return "Failure";
		}
		
		@PutMapping("/supplier/{supplier_id}")
		public String updateInfoCo(@RequestBody Suppliers suppliers, @PathVariable int supplier_id) 
		{
				
			int result = SupplierDao.updateInfoCo(suppliers,supplier_id);
			if (result == 1) 
			{
				return "Success";
			}
			else return "Failure";
				
		}
		
		@DeleteMapping("/supplier/{supplier_id}")
		public String deleteInfoCo(@PathVariable int supplier_id) 
		{
			int result = SupplierDao.deleteInfoCo(supplier_id);
			if (result == 1) {return "SUCCESS";}
			else return "FAILURE";
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
