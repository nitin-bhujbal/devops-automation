package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select u from Student u")
	List<Student> getAllStudent();

	@Query("select u from Student u where u.id=:m")
	Student getStudentById(@Param("m") Integer id);

}
