package com.studentApp.service;

import java.sql.SQLException;
import java.util.List;

import com.studentApp.dao.IStudentDao;
import com.studentApp.dao.StudentDaoImpl;
import com.studentApp.model.Student;

public class StudentServiceImpl implements IStudentService {

	
	IStudentDao studentDao = new StudentDaoImpl();
	
	public void addStudent(Student student) throws SQLException  {
		studentDao.addStudent(student);

	}

	public void deleteStudent(int id) throws SQLException {
		studentDao.deleteStudent(id);
	}

	public List<Student> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}

	public Student getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

}
