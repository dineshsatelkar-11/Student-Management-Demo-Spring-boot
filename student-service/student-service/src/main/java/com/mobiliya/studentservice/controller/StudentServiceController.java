package com.mobiliya.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobiliya.studentservice.dto.StudentDto;
import com.mobiliya.studentservice.entity.Student;
import com.mobiliya.studentservice.service.IStudentService;



@Controller
@RequestMapping("studentservice")
public class StudentServiceController {

	@Autowired
	private IStudentService service;
	
	@PostMapping("students")
	public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){
		StudentDto studentDto1 = service.addStudent(studentDto);
		return new ResponseEntity<StudentDto>(studentDto1, HttpStatus.OK);
		
	}
	
	@PostMapping("students/update")
	public void updateStudent(@RequestBody StudentDto studentDto){
	    service.updateStudent(studentDto);
		
	}
	@GetMapping("students")
	public ResponseEntity<List<StudentDto>> getAllStudentDto(){
		
		List<StudentDto> student = service.getAllStudent();
		return new ResponseEntity<List<StudentDto>>(student, HttpStatus.OK);
		
	}
	
	@GetMapping("students/{studentId}")
	public ResponseEntity<StudentDto> getStudentDtoById(@PathVariable("studentId") Long studentId){
		StudentDto student = service.getStudentById(studentId);
		return new ResponseEntity<StudentDto>(student, HttpStatus.OK);
	}
	
}
