package com.mobiliya.teacherservice.transformer;

import com.mobiliya.teacherservice.dto.StudentDto;
import com.mobiliya.teacherservice.entity.Student;

public class StudentTransformer {

	public static StudentDto getStudentEntityToDto(Student student) {
		StudentDto studentDto = new StudentDto();
		studentDto.setAvg(student.getAvg());
		studentDto.setChemistry(student.getChemistry());
		studentDto.setPhysics(student.getPhysics());
		studentDto.setMaths(student.getMaths());
		studentDto.setName(student.getName());
		studentDto.setEmail(student.getEmail());
		studentDto.setTotal(student.getTotal());
		studentDto.setId(student.getId());
		return studentDto;
	}

	public static Student getStudentDtoToEntity(StudentDto studentDto) {
		Student student = new Student();
		student.setAvg(studentDto.getAvg());
		student.setChemistry(studentDto.getChemistry());
		student.setPhysics(studentDto.getPhysics());
		student.setMaths(studentDto.getMaths());
		student.setName(studentDto.getName());
		student.setEmail(studentDto.getEmail());
		student.setTotal(studentDto.getTotal());
		student.setId(studentDto.getId());
		return student;
	}
}
