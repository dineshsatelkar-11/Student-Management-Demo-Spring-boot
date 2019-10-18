package com.mobiliya.teacherservice.dao;

import java.util.List;

import com.mobiliya.teacherservice.dto.TeacherDto;

public interface ITeacherDao {
	List<TeacherDto> getAllTeacher();
	List<TeacherDto> getAllTeacher(long studentId);
	TeacherDto getTeacherById(long teacherId);
	boolean addTeacher(TeacherDto teacherDto);
}
