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

import com.anq.LifePP.Entity.CoachEntity;
import com.anq.LifePP.Service.CoachService;

@RestController
@RequestMapping("/coach")
public class CoachController {
	
	@Autowired
	CoachService s;
	
	@GetMapping("/print")
	public String hello(){
		return "It works";
	}
	
	@PostMapping("/insert")
	public CoachEntity insertCoach(@RequestBody CoachEntity e) {
		return s.insertCoach(e);
	}
	
    @GetMapping("/get")
    public List<CoachEntity> getAllCoachs(){
    	return s.getallCoach();
    }
    
    @PutMapping("/update")
    public CoachEntity updateStudent(@RequestParam int sid, @RequestBody CoachEntity n){
    	return s.updateCoach(sid, n);
    }
    
    @DeleteMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable int sid) {
    	return s.deleteCoach(sid);
    }
}
