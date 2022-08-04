package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Model.Student;
import com.BikkadIT.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/save",produces = "application/json",consumes = "application/json")
	public ResponseEntity<String> saveStudent(@RequestBody Student student)
	{
		Student student1 = studentService.saveStudent(student);
		
		return new ResponseEntity<String>("Student Data Saved With Id : "+student1.getId(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllData",produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> allStudent = studentService.getAllStudent();
		if(allStudent !=null)
		{
		return new ResponseEntity<List<Student>>(allStudent,HttpStatus.OK);
	   	}
		
		return new ResponseEntity<>(allStudent,HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(value = "/getStudent/{age}",produces = "application/json")
	public ResponseEntity<List<Student>> getStudentByAge(@PathVariable int age)
	{
		List<Student> student = studentService.getStudentByAge(age);
		
		if(student != null)
		{
			return new ResponseEntity<List<Student>>(student,HttpStatus.OK);
		}
		return new ResponseEntity<List<Student>>(student,HttpStatus.BAD_REQUEST);
	}
}
