package com.colco.project.MedicalRepresentative.rest;

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

import com.colco.project.MedicalRepresentative.entity.Representative;
import com.colco.project.MedicalRepresentative.service.RepresentativeService;

@RestController
@RequestMapping("/represent")
public class RepresentativeRestController {

	private RepresentativeService service;
	
	@Autowired
	public RepresentativeRestController(RepresentativeService theService) {
		this.service=theService;
	}
	
	@GetMapping("/list")
	public List<Representative> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/list/{theId}")
	public Representative get(@PathVariable int theId ) {
		
		Representative therepresentative=service.findById(theId);
		if(therepresentative==null) {
			throw new RuntimeException("RepresentativeId not Found: " + theId);
		}
		return therepresentative;
		
	}
	
	@PostMapping("/save")
	public Representative save(@RequestBody Representative therepresentative) {
		
		therepresentative.setId(0);
		service.save(therepresentative);
		return therepresentative;
		
	}
	@PutMapping("/update")
	public Representative update(@RequestBody Representative therepresentative) {
		
		service.save(therepresentative);
		return therepresentative;
		
	}
	
	@DeleteMapping("/delete/{theId}")
	public String delete(@PathVariable int theId) {
		Representative represent=service.findById(theId);
		if(represent==null) {
			throw new RuntimeException("Id doesn't exist: " + theId);
			
		}
		service.delete(theId);
		return "Deleted theId : " + theId;
	}
	

}
