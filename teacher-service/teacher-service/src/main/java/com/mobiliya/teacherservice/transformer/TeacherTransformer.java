package com.mobiliya.teacherservice.transformer;

import com.mobiliya.teacherservice.dto.TeacherDto;
import com.mobiliya.teacherservice.entity.Teacher;

public class TeacherTransformer {

	public static TeacherDto getTeacherEntityToDto(Teacher teacher) {
		TeacherDto teacherDto=new TeacherDto();
		teacherDto.setId(teacher.getId());
		teacherDto.setMarks(teacher.getMarks());
		teacherDto.setName(teacher.getName());
		teacherDto.setStudent_id(teacher.getStudentid());
		teacherDto.setSubject(teacher.getSubject());
		return teacherDto;
	}
	
	public static Teacher getTeacherDtoToEntity(TeacherDto teacherDto) {
		Teacher teacher=new Teacher();
		teacher.setId(teacherDto.getId());
		teacher.setMarks(teacherDto.getMarks());
		teacher.setName(teacherDto.getName());
		teacher.setStudentid(teacherDto.getStudentid());
		teacher.setSubject(teacherDto.getSubject());
		return teacher;
	}
}
