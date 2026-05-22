package com.practice.service;


import java.util.List;

import com.practice.entities.Student;


public interface Services {
	
	public boolean saveStudent(Student std);
	boolean existsByEmail(String email);
	public List<Student>geAllStudent();
	
}
