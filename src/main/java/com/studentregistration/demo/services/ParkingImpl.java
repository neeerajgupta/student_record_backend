package com.studentregistration.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentregistration.demo.entity.Parking;
import com.studentregistration.demo.reposotery.Parkingrepo;
@Service
public class ParkingImpl implements Parkingservice {

	
	@Autowired
	private Parkingrepo parkingrepo;
	@Override
	public List<Parking> getAll() {
		List<Parking> findAll = parkingrepo.findAll();
		return findAll;
	}

	@Override
	public Parking create(Parking parking) {
		parkingrepo.save(parking);
		return parking;
	}

	@Override
	public List<Parking> getByName(String name) {
		// TODO Auto-generated method stub
		return parkingrepo.getByName(name);
	}

	@Override
	public Parking update(Parking parking ,int id) {
		parking.setId(id);
		return parkingrepo.save(parking);
	}

	@Override
	public void deletbyid(int id) {
		try {
			parkingrepo.deleteById(id);
		} catch (Exception e) {
			System.out.println("No such type is elements which want you delete :");
		
		}
		
	}

	
	

}
