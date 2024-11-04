package com.telusko.springsec.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springsec.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	
	List<Student> students = new ArrayList<>(List.of(
			new Student(1, "Darshan"),
			new Student(2, "Indresh")));
	
	
	@GetMapping("students")
	public List<Student> getStudents()
	{
		return students; 
	}
	
	@GetMapping("csrf")
	public CsrfToken getcsrfToken(HttpServletRequest req)
	{
		return (CsrfToken) req.getAttribute("_csrf");
		
	}
	
	@PostMapping("student")
	public String addStudent(@RequestBody Student student)
	{
		students.add(student);
		return "added";
	}

}
