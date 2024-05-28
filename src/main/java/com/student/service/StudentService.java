package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> getAllStudent();

	Student getStudentById(Integer id);

	

	Student updateStudent(Student student);

	Student deleteStudentById(Integer id);

}
