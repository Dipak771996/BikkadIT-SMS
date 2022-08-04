package com.BikkadIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Model.Student;
import com.BikkadIT.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		Student student1 = studentRepository.save(student);
		return student1;
	}

	@Override
	public List<Student> getAllStudent() {
		
		List<Student> findAll = studentRepository.findAll();
		
		return findAll;
	}

	@Override
	public Student getStudentByAge(Integer age) {
		
		Student student = studentRepository.findByAge(age);
		return student;
	}

}
