package com.mobiliya.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiliya.studentservice.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {


}
