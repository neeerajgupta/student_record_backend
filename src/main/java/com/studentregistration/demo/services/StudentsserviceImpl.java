package com.studentregistration.demo.services;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.studentregistration.demo.entity.Students;
import com.studentregistration.demo.reposotery.StudentRepo;
@Service
public class StudentsserviceImpl implements Studentservice {
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public List<Students> getAll() {
		List<Students> findAll= studentrepo.findAll();
		
		return findAll;
	}

	@Override
	public Students create(Students student) {
		studentrepo.save(student);
		return student;
	}

	

	@Override
	public void deletbyid(int rollno) {
		
		try {
			studentrepo.deleteById( rollno);

		} catch (Exception e) {
			System.out.println("No such type is elements which want you delete :");
		}

	}


	
	
	public List<Students> getByName(String name){
	return	studentrepo.getByName(name);
	}

	

	
}

	



