package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class Controller {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		Student s = this.studentService.saveStudent(student);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<?> getAllStudent(){
		List<Student> s = this.studentService.getAllStudent();
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	
	@GetMapping("/getStudentById/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Integer id){
		Student s = this.studentService.getStudentById(id);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity<?> updateStudentById(@RequestBody Student student){
		Student s = this.studentService.updateStudent(student);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public ResponseEntity<?> deleteStudentById(@PathVariable Integer id){
		Student s = this.studentService.deleteStudentById(id);
		return new ResponseEntity<>(s, HttpStatus.OK);				
	}
	
}
