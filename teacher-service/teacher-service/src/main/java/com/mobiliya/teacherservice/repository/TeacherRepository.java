package com.mobiliya.teacherservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiliya.teacherservice.entity.Teacher;



public interface TeacherRepository extends JpaRepository<Teacher, Long> 

{

	List<Teacher> findBySubjectAndStudentid(String subject,Long studentid);
	List<Teacher> findByStudentid(Long studentid);
}
