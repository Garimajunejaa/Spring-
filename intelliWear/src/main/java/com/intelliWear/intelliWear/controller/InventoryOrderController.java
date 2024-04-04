package com.intelliWear.intelliWear.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.intelliWear.intelliWear.dao.InventoryOrderDao;
import com.intelliWear.intelliWear.entities.InventoryOrder;

@RestController
@RequestMapping("/inventoryorder")
public class InventoryOrderController {

	@Autowired
	InventoryOrderDao InventoryOrderDao;
	
	
	//CRUD OPERATIONS ON SUPPLIER TABLE
	
	//get the flight
	@GetMapping("/allorder")
	public List<InventoryOrder> fetchinfoCo()
	{
		return InventoryOrderDao.fetchinfoCo();
			
	} 
		
	@GetMapping("/inventoryorder/{id}")
	public InventoryOrder fetchInfoOrderCoCu(@PathVariable int id) 
	{
		return InventoryOrderDao.fetchInfoOrderCoCu(id);
		
	}
		
	@PostMapping("/inventoryorder")
	public String addInfoCo(@RequestBody InventoryOrder InventoryOrder) 
	{
		int result = InventoryOrderDao.addInfoCo(InventoryOrder);
		if (result == 1) {return "Success";}
		else return "Failure";
	}
		
	@PutMapping("/inventoryorder/{order_id}")
	public String updateInfoCo(@RequestBody InventoryOrder InventoryOrder, @PathVariable("order_id") int order_id) 
	{
				
		int result = InventoryOrderDao.updateInfoCo(InventoryOrder,order_id);
		if (result == 1) {return "Success";}
		else return "Failure";
				
	}
		
	@DeleteMapping("/inventoryorder/{id}")
	public String deleteInfoCo(@PathVariable int id) 
	{
		int result = InventoryOrderDao.deleteInfoCo(id);
		if (result == 1) {return "SUCCESS";}
		else return "FAILURE";
	}
	
	
}
