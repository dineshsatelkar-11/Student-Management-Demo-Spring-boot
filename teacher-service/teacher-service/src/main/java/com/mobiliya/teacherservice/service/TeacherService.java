package com.mobiliya.teacherservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobiliya.teacherservice.dao.ITeacherDao;
import com.mobiliya.teacherservice.dto.StudentDto;
import com.mobiliya.teacherservice.dto.TeacherDto;
import com.mobiliya.teacherservice.entity.Student;
import com.mobiliya.teacherservice.entity.Teacher;
import com.mobiliya.teacherservice.repository.TeacherRepository;
import com.mobiliya.teacherservice.transformer.StudentTransformer;
import com.mobiliya.teacherservice.transformer.TeacherTransformer;



@Service
public class TeacherService implements ITeacherService {


	   
	@Autowired
	private ITeacherDao teacherDao;
	
	
	
	@Override
	public List<TeacherDto> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherDao.getAllTeacher();
	}

	@Override
	public List<TeacherDto> getAllTeacher(long studentId) {
		// TODO Auto-generated method stub
		return teacherDao.getAllTeacher(studentId);
	}

	@Override
	public TeacherDto getTeacherById(long teacherId) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherById(teacherId);
	}

	@Override
	public boolean addTeacher(TeacherDto teacherDto) {
		// TODO Auto-generated method stub
		return teacherDao.addTeacher(teacherDto);
	}
		
	}


