package com.BikkadIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findByAge(Integer age);
	
}
