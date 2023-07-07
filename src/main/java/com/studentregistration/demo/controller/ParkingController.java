package com.studentregistration.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentregistration.demo.entity.Parking;

import com.studentregistration.demo.services.Parkingservice;

@RestController
@RequestMapping("/api")
public class ParkingController {
	
	@Autowired
	private Parkingservice parkingservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/all")
	public List<Parking> getAll(){
		return parkingservice.getAll();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/onev")
	public String save(@RequestBody Parking parking) {
		parkingservice.create(parking);
		return "hii  "+parking.getLicense_plate()+"  You data is edited ";
		
	}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/one/{name}")
	public List<Parking>getByNmae(@PathVariable("name") String name){
		return parkingservice.getByName(name);
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/oneu/{id}")
	public void update(@RequestBody Parking person,@PathVariable("id") int id) {
		try {
			parkingservice.update(person, id);
		}catch (Exception e) {
			System.out.println("No such type of Element: ");
		}
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/oned/{id}")
	public List<Parking> Deletbyid(@PathVariable("id") int id) {
		
			parkingservice.deletbyid( id);
			return parkingservice.getAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
