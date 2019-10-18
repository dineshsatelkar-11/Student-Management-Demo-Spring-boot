package com.mobiliya.teacherservice.service;

import java.util.List;

import com.mobiliya.teacherservice.dto.TeacherDto;
import com.mobiliya.teacherservice.entity.Teacher;


public interface ITeacherService {

	List<TeacherDto> getAllTeacher();
	List<TeacherDto> getAllTeacher(long studentId);
	TeacherDto getTeacherById(long teacherId);
	boolean addTeacher(TeacherDto teacherDto);
}
