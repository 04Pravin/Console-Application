package com.studentApp.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.studentApp.model.Student;
import com.studentApp.service.IStudentService;
import com.studentApp.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) throws SQLException {
		
		IStudentService studentService = new StudentServiceImpl();
		
		System.out.println("Select your role\n1. user\n2. admin\nPress 0 for exit");
		Scanner sc = new Scanner(System.in);

		int select = sc.nextInt();
		int inf=1;
		while(inf!=0) {
		switch (select) {

		case 1:
			System.out.println("Welcome user");
			break;
		case 2: {
			System.out.println("Welcome admin");
			System.out.println("Please select\n1. Add a student\n2. Edit a student\n3. Delete a student\n4. Show all");
			int option = sc.nextInt();
			
			switch(option) {
			case 1:{
				
				System.out.println("Adding a student");
				
				System.out.println("Enter student id:");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter student name:");
				String name = sc.nextLine();
				
				System.out.println("Enter student department:");
				String department = sc.nextLine();
				
				System.out.println("Enter mobile number:");
				String mobileNum = sc.nextLine();
				
				System.out.println("Enter college:");
				String college = sc.nextLine();
				
				Student student = new Student(id, name, department, mobileNum, college);
	
				studentService.addStudent(student);
	
				System.out.println("Added successfully");
				break;
			}
			case 2:{
				System.out.println("Editing a Student");
				break;
			}
			case 3:{
				System.out.println("Deleting a student");
				break;
			}
			case 4:{
				System.out.println("Showing all");
				List<Student> students = studentService.getAll();
				for(Student student:students) {
					System.out.println(student);
				}
				System.out.println();
				break;
			}
			default: System.out.println("Invalid option");
			}
			break;
		}
		
		case 0:{
			System.out.println("Thank you");
			inf = 0;
			break;
		}
		default:
			System.out.println("Invalid option");
		}

		
	}
		sc.close();
	}
	

}
