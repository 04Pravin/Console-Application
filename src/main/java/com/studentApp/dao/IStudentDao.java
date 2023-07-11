package com.studentApp.dao;

import java.sql.SQLException;
import java.util.List;

import com.studentApp.model.Student;

public interface IStudentDao {

	public void addStudent(Student student) throws SQLException ;

	public void deleteStudent(int id);
	
	public List<Student> getAll() throws SQLException ;

}
