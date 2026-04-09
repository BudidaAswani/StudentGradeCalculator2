package StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	/*
	  Task 2: Create a Student Grade Management System 
		Explanation: 
			• Create a program to input student name, marks in 3 subjects 
			• Calculate average and grade (A/B/C/Fail) 
			• Display student report 
		Goal: Learn classes, arrays, and basic logic. 
	 */
	char grade(double avg) {
		if(avg>=75)
			return 'A';
		else if(avg>=60)
			return 'B';
		else if(avg>=40)
			return 'C';
		else 
			return 'F';
	}

	public static void main(String[] args) {
		String name;
		int m1,m2,m3;
		double avg;
		char grade;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student name: ");
		name=sc.next();
		System.out.print("Enter subject1 Marks: ");
		m1=sc.nextInt();
		System.out.print("Enter Subject2 Marks: ");
		m2=sc.nextInt();
		System.out.print("Enter Subject3 Marks: ");
		m3=sc.nextInt();
		avg=(m1+m2+m3)/3;
		StudentGradeCalculator s=new StudentGradeCalculator();
		grade=s.grade(avg);
		System.out.println("---Student Report---");
		System.out.println("Name\t:\t"+name);
		System.out.println("Marks\t:");
		System.out.println("Subject1\t:\t"+m1);
		System.out.println("Subject2\t:\t"+m2);
		System.out.println("Subject3\t:\t"+m3);
		System.out.println("Average\t:\t"+avg);
		System.out.println("Grade\t:\t"+grade);
		
	}
	
}
