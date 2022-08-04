package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.Model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public List<Student> getAllStudent();
	public List<Student> getStudentByAge(int age);
}
