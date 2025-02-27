package com.anq.LifePP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anq.LifePP.Entity.ShopEntity;
import com.anq.LifePP.Service.ShopService;

@RestController
@RequestMapping("/Shop")
public class ShopController {
	
	@Autowired
	ShopService s;
	
	@GetMapping("/print")
	public String hello(){
		return "It works";
	}
	
	@PostMapping("/insert")
	public ShopEntity insertShop(@RequestBody ShopEntity e) {
		return s.insertShop(e);
	}
	
    @GetMapping("/get")
    public List<ShopEntity> getAllShops(){
    	return s.getallShop();
    }
    
    @PutMapping("/update")
    public ShopEntity updateStudent(@RequestParam int sid, @RequestBody ShopEntity n){
    	return s.updateShop(sid, n);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid) {
    	return s.deleteShop(sid);
    }
}
