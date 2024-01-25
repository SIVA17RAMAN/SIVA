package edu.kec.sms;

import java.util.Scanner;

import edu.kec.sms.iservice.IStudentService;
import edu.kec.sms.model.Student;
import edu.kec.sms.service.StudentService;

public class Main {
    //private static Integer choice=null;
	public static void main(String[] args) 
	{
		IStudentService studentService = new StudentService();
		
		Student student=readStudent();
		if(studentService.add(student))
		{
			System.out.println("Student added...");
		}
		else {
			System.out.println("Failed to add s1tudent...");
		}
		Student arryStudent=studentService.getStudentById(1);
		System.out.println(arryStudent.getName());

	}
	public static Student readStudent() {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		System.out.print("Enter name:");
		student.setName(sc.nextLine());
		System.out.print("Enter email:");
		student.setEmail(sc.nextLine());
		System.out.print("Enter id:");
		student.setId(sc.nextInt());
		System.out.print("Enter mobile_no:");
		student.setMobile(sc.nextLong());
		sc.close();
		return student;
		
	}
}
