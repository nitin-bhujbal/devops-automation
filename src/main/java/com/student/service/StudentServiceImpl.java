package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.IdEmptyException;
import com.student.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Integer id = student.getSId();
		if (id==null) {
			throw new IdEmptyException("Id is not filledd please fill the Id");
		}
		Student s = this.studentRepo.save(student);
		return s;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> s = this.studentRepo.getAllStudent();
		return s;
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		Student s = this.studentRepo.getStudentById(id);
		return s;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student s = this.saveStudent(student);
		return s;
	}

	@Override
	public Student deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		Student s = this.getStudentById(id);
		this.studentRepo.deleteById(id);
		return s;
	}

	
	

}
