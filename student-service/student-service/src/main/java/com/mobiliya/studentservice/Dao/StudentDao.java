package com.mobiliya.studentservice.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobiliya.studentservice.dto.StudentDto;
import com.mobiliya.studentservice.entity.Student;
import com.mobiliya.studentservice.repository.IStudentRepository;
import com.mobiliya.studentservice.transformer.StudentTransformer;


@Transactional
@Repository
public class StudentDao implements IStudentDao {

	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public List<StudentDto> getAllStudent() {
		// TODO Auto-generated method stub
		List<StudentDto> list = new ArrayList<>();
		studentRepository.findAll().forEach(e -> list.add(StudentTransformer.getStudentEntityToDto(e)));
		return list;
	}

	@Override
	public StudentDto getStudentById(long studentId) {
		// TODO Auto-generated method stub
		Student obj = studentRepository.findById(studentId).get();
		return StudentTransformer.getStudentEntityToDto(obj);
	}

	@Override
	public StudentDto addStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		Student student = StudentTransformer.getStudentDtoToEntity(studentDto);
		int total = student.getChemistry() + student.getPhysics() + student.getMaths();
		double avg = total / 3;
		student.setAvg(avg);
		student.setTotal(total);
		return StudentTransformer.getStudentEntityToDto(studentRepository.save(student));

	}

	@Override
	public void updateStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		Student student = StudentTransformer.getStudentDtoToEntity(studentDto);
		int total = student.getChemistry() + student.getPhysics() + student.getMaths();
		double avg = total / 3;
		student.setAvg(avg);
		student.setTotal(total);
		studentRepository.save(student);
		
	}
	
	
	
	


}
