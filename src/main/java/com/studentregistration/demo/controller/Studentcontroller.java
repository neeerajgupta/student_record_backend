package com.studentregistration.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentregistration.demo.entity.Students;

import com.studentregistration.demo.services.Studentservice;


@RestController
@RequestMapping("/api")
public class Studentcontroller {
	@Autowired
	private Studentservice studentservice;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/allstudent")
	public List<Students> getall(){
		return studentservice.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/student")
	public String save(@RequestBody Students student) {
		studentservice.create(student);
		return "hii  "+student.getName()+"  You data is edited ";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/student/{rollno}")
	public List<Students>  deletebyid(@PathVariable("rollno")  int rollno) {
		studentservice.deletbyid(rollno);
		return studentservice.getAll();
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/student/{name}")
	public List<Students>getByName(@PathVariable("name") String name){
		return studentservice.getByName(name);
		
	}
	
	
		
		
	}
	


