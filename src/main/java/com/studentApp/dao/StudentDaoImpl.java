package com.studentApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.studentApp.model.Student;

public class StudentDaoImpl implements IStudentDao {

	public Connection getConnection() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/jdbcStudent";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		;

		return connection;
	}

	public void addStudent(Student student) throws SQLException {
		String insertQuery = "insert into student(id, name, department, mobileNum, college) values (?, ?, ?, ?, ?)";
		Connection connection = getConnection();
		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, student.getId());
			statement.setString(2, student.getName());
			statement.setString(3, student.getDepartment());
			statement.setString(4, student.getMobileNum());
			statement.setString(5, student.getCollege());
			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public void deleteStudent(int id) throws SQLException {
		String deleteQuery = "delete from student where id=?";

		Connection connection = getConnection();
		PreparedStatement statement = null;

		statement = connection.prepareStatement(deleteQuery);
		statement.setInt(1, id);
		statement.executeUpdate();

	}

	public List<Student> getAll() throws SQLException {
		String reteriveQuery = "select * from student";

		Connection connection = getConnection();
		PreparedStatement statement = null;

		statement = connection.prepareStatement(reteriveQuery);
		ResultSet resultSet = statement.executeQuery();
		List<Student> studentList = new ArrayList<Student>();
		while (resultSet.next()) {
			Student student = new Student();

			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String department = resultSet.getString(3);
			String mobileNum = resultSet.getString(4);
			String college = resultSet.getString(5);

			student.setId(id);
			student.setName(name);
			student.setDepartment(department);
			student.setMobileNum(mobileNum);
			student.setCollege(college);

			studentList.add(student);

		}

		return studentList;
	}

	public Student getById(int id) throws SQLException {
		String detailViewQuery = "select * from student where id = ?";

		Connection connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(detailViewQuery);
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery();
		Student student = new Student();
		while (resultSet.next()) {

			int sId = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String department = resultSet.getString(3);
			String mobileNum = resultSet.getString(4);
			String college = resultSet.getString(5);

			student.setId(sId);
			student.setName(name);
			student.setDepartment(department);
			student.setMobileNum(mobileNum);
			student.setCollege(college);
		}
		return student;
	}

}
