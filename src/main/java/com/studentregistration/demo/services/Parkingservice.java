package com.studentregistration.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentregistration.demo.entity.Parking;
@Service
public interface Parkingservice {
	List<Parking> getAll();
	Parking create(Parking parking);
	
	
	public List<Parking> getByName(String name);

	
	public Parking update(Parking parking,int id);
	
	
	public void deletbyid(int id);
}
