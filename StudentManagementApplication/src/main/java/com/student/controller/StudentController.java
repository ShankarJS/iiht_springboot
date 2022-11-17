package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.services.IStudentService;

@RestController
public class StudentController {
	
	@Autowired
	IStudentService studentService;
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "Hey Shankar! How are you?";
	}
	
	//Controller to add a student
	@PostMapping("/addstudent")
	Integer createStudent(@RequestBody Student student) {
		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;
	}

}
