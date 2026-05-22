package com.practice.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entities.Student;
import com.practice.repository.StudentRepo;

@Service
public class ServiceImpl implements Services{
	
	@Autowired
	private StudentRepo stdRepo;
	
	
	// student registration part complete // 10/03/26
	
	@Override
	public boolean saveStudent(Student std) {
		
		if(stdRepo.existsByEmail(std.getEmail())) {
			System.out.println("Email already exists");
            return false;
		}
		
		Student saved = stdRepo.save(std);
		
		if(saved != null) {
			System.out.println("Data Saved Succefully");
			return true;
		}
		else {
			System.out.println("Data not saved Due to some Error");
			return false;
		}
	}

	@Override
	public boolean existsByEmail(String email) {
		
		return stdRepo.existsByEmail(email);
	}

	@Override
	public List<Student> geAllStudent() {
		
		List<Student> list = stdRepo.findAll();
		if(list.isEmpty()) {
			System.out.println("Data not found");
		}
		return list;
		
	}

	
	
	
	

}
