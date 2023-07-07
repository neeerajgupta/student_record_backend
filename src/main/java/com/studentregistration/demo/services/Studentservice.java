package com.studentregistration.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.studentregistration.demo.entity.Students;
@Service
public interface Studentservice {
	List<Students> getAll();
	
	Students create(Students student);

	public void deletbyid(int rollno);
	
	
	
	public List<Students> getByName(String name);
	

	

}
