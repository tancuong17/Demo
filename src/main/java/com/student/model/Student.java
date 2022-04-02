package com.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	private int idStudent;
	private String nameStudent;
	private int birthStudent;
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public int getBirthStudent() {
		return birthStudent;
	}
	public void setBirthStudent(int birthStudent) {
		this.birthStudent = birthStudent;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int idStudent, String nameStudent, int birthStudent) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.birthStudent = birthStudent;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", birthStudent=" + birthStudent
				+ "]";
	}
}
