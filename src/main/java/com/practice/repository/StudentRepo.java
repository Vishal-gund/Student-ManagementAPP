package com.practice.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entities.Student;

public interface StudentRepo extends JpaRepository<Student , Long>{
	boolean existsByEmail(String email);

}
