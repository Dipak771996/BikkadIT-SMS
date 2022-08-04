package com.BikkadIT.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByAge(Integer age);
	
}
