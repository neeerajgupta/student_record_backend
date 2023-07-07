package com.studentregistration.demo.reposotery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentregistration.demo.entity.Parking;


@Repository
public interface Parkingrepo extends JpaRepository<Parking, Integer> {
	
   public List<Parking> getByName(String name);

}
