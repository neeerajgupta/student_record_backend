package com.studentregistration.demo.reposotery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentregistration.demo.entity.Students;
@Repository
public interface StudentRepo extends JpaRepository<Students, Integer>{
	
	
	public List<Students> getByName(String name);

}
