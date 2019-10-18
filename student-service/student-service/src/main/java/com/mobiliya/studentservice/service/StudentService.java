package com.mobiliya.studentservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mobiliya.studentservice.Dao.IStudentDao;
import com.mobiliya.studentservice.dto.StudentDto;
import com.mobiliya.studentservice.entity.Student;
import com.mobiliya.studentservice.repository.IStudentRepository;
import com.mobiliya.studentservice.transformer.StudentTransformer;

import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudentDao studentDao;

	@Override
	public List<StudentDto> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	@Override
	public StudentDto getStudentById(long studentId) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(studentId);
	}

	@Override
	public StudentDto addStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		return studentDao.addStudent(studentDto);

	}

	@Override
	public void updateStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		 studentDao.updateStudent(studentDto);

	}



}
