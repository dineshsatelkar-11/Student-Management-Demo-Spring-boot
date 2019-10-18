package com.mobiliya.teacherservice.dao;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.mobiliya.teacherservice.dto.StudentDto;
import com.mobiliya.teacherservice.dto.TeacherDto;
import com.mobiliya.teacherservice.entity.Student;
import com.mobiliya.teacherservice.entity.Teacher;
import com.mobiliya.teacherservice.repository.TeacherRepository;
import com.mobiliya.teacherservice.transformer.StudentTransformer;
import com.mobiliya.teacherservice.transformer.TeacherTransformer;

@Transactional
@Repository
public class TeacherDao implements ITeacherDao {

	
	    @Autowired
	    private RestTemplate restTemplate;

	    
		@Autowired
		private TeacherRepository teacherRepository;
		
		@Override
		public List<TeacherDto> getAllTeacher() {
			List<TeacherDto> list = new ArrayList<>();
			teacherRepository.findAll().forEach(e -> list.add(TeacherTransformer.getTeacherEntityToDto(e)));
			return list;
		}

		@Override
		public List<TeacherDto> getAllTeacher(long studentId) {
			// TODO Auto-generated method stub
			List<TeacherDto> list = new ArrayList<>();
			teacherRepository.findByStudentid(studentId).forEach(e -> list.add(TeacherTransformer.getTeacherEntityToDto(e)));
			return list;
		}

		@Override
		public TeacherDto getTeacherById(long teacherId) {
			// TODO Auto-generated method stub
			TeacherDto obj = TeacherTransformer.getTeacherEntityToDto(teacherRepository.findById(teacherId).get());
			return obj;

		}

		@Override
		public boolean addTeacher(TeacherDto teacherDto) {
			// TODO Auto-generated method stub
			try{
				List<Teacher> list = teacherRepository.findBySubjectAndStudentid(teacherDto.getSubject(), teacherDto.getStudentid());
						if (list.size() > 0) {
				return false;
			} else {		
			ArrayList arr=new ArrayList<>();
			arr.add("MATHS");
			arr.add("PHYSICS");
			arr.add("CHEMISTRY");
			if(!arr.contains(teacherDto.getSubject()))
			{
			Teacher teacher=teacherRepository.save(TeacherTransformer.getTeacherDtoToEntity(teacherDto));
			Student student = restTemplate.getForObject("http://localhost:8080/studentservice/students/" + teacher.getStudentid(),Student.class);
	        if(teacher.getSubject().toUpperCase().equals("MATHS"))
			{
				student.setMaths(teacher.getMarks());
			}else if(teacher.getSubject().toUpperCase().equals("PHYSICS"))
			{
				student.setPhysics(teacher.getMarks());
			}
			else if(teacher.getSubject().toUpperCase().equals("CHEMISTRY")) 
			{
				student.setChemistry(teacher.getMarks());
			}else {}
					restTemplate.postForObject("http://localhost:8080/studentservice/students/update", StudentTransformer.getStudentEntityToDto(student), StudentDto.class);
					return true;
				}
			else
			{
				return false;
			}
		
		}
			}catch(Exception e)
			{
				return false;
			}
		}
		
		
}
