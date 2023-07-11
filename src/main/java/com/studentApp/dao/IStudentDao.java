package com.studentApp.dao;

import java.sql.SQLException;
import java.util.List;

import com.studentApp.model.Student;

public interface IStudentDao {

	public void addStudent(Student student) throws SQLException ;

	public void deleteStudent(int id) throws SQLException ;
	
	public List<Student> getAll() throws SQLException ;
	
	public Student getById(int id) throws SQLException;

}
