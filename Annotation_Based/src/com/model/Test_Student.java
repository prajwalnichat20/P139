package com.model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.client.Student;

public class Test_Student {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  Number of Student yoy want to add");
	int input = sc.nextInt();
	for (int i =1; i <=input; i++) {
		
	
		Configuration cfg= new Configuration();
	
		cfg.configure("com/configer/Hibernate.cfg.xml");
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session session= sf.openSession();
	Transaction tx=session.beginTransaction();
	Student s= new Student();
		/*
		 * Student s= session.get(Student.class, 2); System.out.println(s.getRollno());
		 * System.out.println(s.getName()); System.out.println(s.getMobileno());
		 */
		
		  System.out.println("Enter Roll No"); 
		  s.setRollno(sc.nextInt());
		  System.out.println("Enter the name");
		  s.setName(sc.next());
		  System.out.println("Enter the mobile no"); 
		  s.setMobileno(sc.nextLong());
		  session.save(s);
		  tx.commit();
	}	 
}
}
