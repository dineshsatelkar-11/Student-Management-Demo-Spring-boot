package com.mobiliya.studentservice.Dao;

import java.util.List;

import com.mobiliya.studentservice.dto.StudentDto;

public interface IStudentDao {

	List<StudentDto> getAllStudent();
	StudentDto getStudentById(long studentleId);
	StudentDto addStudent(StudentDto studentDto);
	void updateStudent(StudentDto studentDto);
    
}
