package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private Integer SId;
	private String SName;
	private String SClass;
	private String SClassTeacher;
	private Integer SAge;
	public Integer getSId() {
		return SId;
	}
	public void setSId(Integer sId) {
		SId = sId;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSClass() {
		return SClass;
	}
	public void setSClass(String sClass) {
		SClass = sClass;
	}
	public String getSClassTeacher() {
		return SClassTeacher;
	}
	public void setSClassTeacher(String sClassTeacher) {
		SClassTeacher = sClassTeacher;
	}
	public Integer getSAge() {
		return SAge;
	}
	public void setSAge(Integer sAge) {
		SAge = sAge;
	}
	@Override
	public String toString() {
		return "Student [SId=" + SId + ", SName=" + SName + ", SClass=" + SClass + ", SClassTeacher=" + SClassTeacher
				+ ", SAge=" + SAge + "]";
	}
	public Student(Integer sId, String sName, String sClass, String sClassTeacher, Integer sAge) {
		super();
		SId = sId;
		SName = sName;
		SClass = sClass;
		SClassTeacher = sClassTeacher;
		SAge = sAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
