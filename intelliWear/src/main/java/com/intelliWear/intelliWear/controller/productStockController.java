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
import com.intelliWear.intelliWear.service.ProductService;


@RestController
@RequestMapping("/stock")
public class productStockController {

	@Autowired
	private StockDao StockDao;
	@Autowired
	private ProductService ProductService;
	
	
	
	
	//CRUD OPERATIONS ON SUPPLIER TABLE
	
	//get the product stock
		@GetMapping("/allstock")
		public List<Stock> fetchinfoCo()
		{
			return StockDao.fetchinfoCo();
			
		} 
		
		@GetMapping("/stock/{product_id}")
		public Stock fetchInfoSupplierCoCu(@PathVariable int product_id) 
		{
			return StockDao.fetchInfoStockCoCu(product_id);
			
		}
		
		@PostMapping("/stock")
		public String addInfoCo(@RequestBody Stock stock) 
		{
			int result = StockDao.addInfoCo(stock);
			if (result == 1) {return "Success";}
			else return "Failure";
		}
		
		@PutMapping("/stock/{product_id}")
		public String updateInfoCo(@RequestBody Stock stock, @PathVariable int product_id) 
		{
				
			int result = StockDao.updateInfoCo(stock,product_id);
			if (result == 1) {return "Success";}
			else return "Failure";
				
		}
		
		@DeleteMapping("/stock/{product_id}")
		public String deleteInfoCo(@PathVariable int product_id) 
		{
			int result = StockDao.deleteInfoCo(product_id);
			if (result == 1) {return "SUCCESS";}
			else return "FAILURE";
		}
		
		@GetMapping("/sortphl")
		public List<Stock> sort_price_hl()
		{
			return StockDao.sort_price_hl();
			
		} 
		
		@GetMapping("/sortplh")
		public List<Stock> sort_price_lh()
		{
			return StockDao.sort_price_lh();
			
		}
		
		
		
		@GetMapping("/sortqlh")
		public List<Stock> sort_quantity_lh()
		{
			return StockDao.sort_quantity_lh();
			
		}
		
		@GetMapping("/sortqhl")
		public List<Stock> sort_quantity_hl()
		{
			return StockDao.sort_price_hl();
			
		}
		
		@GetMapping("/filterpmhu")
		public List<Stock> filter_price_mhu()
		{
			return StockDao.filter_price_mhu();
			
		}
		
		@GetMapping("/filterplhu")
		public List<Stock> filter_price_lhu()
		{
			return StockDao.filter_price_lhu();
			
		}
		
		@GetMapping("/filterqlhu")
		public List<Stock> filter_quantity_lhu()
		{
			return StockDao.filter_quantity_lhu();
			
		}
		
		@GetMapping("/filterqmhu")
		public List<Stock> filter_quantity_mhu()
		{
			return StockDao.filter_quantity_mhu();
			
		}
		
		@GetMapping("/filtertrack")
		public List<Stock> filter_tracker()
		{
			return StockDao.filter_tracker();
			
		}
		
		@GetMapping("/filterglass")
		public List<Stock> filter_glasses()
		{
			return StockDao.filter_glasses();
			
		}
		
		@GetMapping("/filterwatch")
		public List<Stock> filter_watch()
		{
			return StockDao.filter_watch();
			
		}
		@GetMapping("/products/{productId}/warehouse")
	    public Warehouse getWarehouseInfoByProductId(@PathVariable int productId) {
	        // Call the ProductService method to get warehouse info by product ID
			
	        return ProductService.getWarehouseInfoByProductId(productId);
	    }
		
		@GetMapping("/orders/{orderId}/product")
	    public Stock getProductInfoInfoByOrderId(@PathVariable int orderId) {
	        // Call the ProductService method to get warehouse info by product ID
			System.out.println("JOINING TWO TABLES");
			System.out.println("order"+orderId+"has following products placed");
	        return ProductService.getProductInfoInfoByOrderId(orderId);
	    }
		
		
		
		
		
		
}
