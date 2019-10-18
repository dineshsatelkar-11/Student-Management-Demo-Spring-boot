package com.mobiliya.studentservice.service;

import java.util.List;

import com.mobiliya.studentservice.dto.StudentDto;
import com.mobiliya.studentservice.entity.Student;


public interface IStudentService {

	List<StudentDto> getAllStudent();
	StudentDto getStudentById(long studentleId);
	StudentDto addStudent(StudentDto studentDto);
	void updateStudent(StudentDto studentDto);
    
}
