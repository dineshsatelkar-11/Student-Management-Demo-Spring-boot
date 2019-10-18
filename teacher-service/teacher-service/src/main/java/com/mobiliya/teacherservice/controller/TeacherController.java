package com.mobiliya.teacherservice.controller;

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
import org.springframework.web.client.RestTemplate;

import com.mobiliya.teacherservice.dto.TeacherDto;
import com.mobiliya.teacherservice.entity.Teacher;
import com.mobiliya.teacherservice.service.ITeacherService;

@Controller
@RequestMapping("teacherservice")
public class TeacherController {
	@Autowired
	private ITeacherService service;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@PostMapping("teachers")
	public ResponseEntity<String> addTeacher(@RequestBody TeacherDto teacher){
		boolean b = service.addTeacher(teacher);
		if(b){
			String responseContent = "Student mark Update successfully";
			return new ResponseEntity<String>(responseContent,HttpStatus.OK);
		}else
		{
			String error = "";
			return new ResponseEntity<String>(error,HttpStatus.OK);
		}
		

	}
	@GetMapping("teachers")
	public ResponseEntity<List<TeacherDto>> getAllTeacher(){
		
		List<TeacherDto> teacher = service.getAllTeacher();
		return new ResponseEntity<List<TeacherDto>>(teacher, HttpStatus.OK);
		
	}
	
	@GetMapping("teachersCorrectedList/{studentId}")
		public ResponseEntity<List<TeacherDto>> getTeachersCorrectedList(@PathVariable("studentId") Long studentId){
		List<TeacherDto> teacher = service.getAllTeacher(studentId);
		return new ResponseEntity<List<TeacherDto>>(teacher, HttpStatus.OK);
		
		
	}
	
	
	@GetMapping("teachers/{teacherId}")
	public ResponseEntity<TeacherDto> getTeacherById(@PathVariable("teacherId") Long teacherId){
		TeacherDto teacher = service.getTeacherById(teacherId);
		return new ResponseEntity<TeacherDto>(teacher, HttpStatus.OK);
	}

}
