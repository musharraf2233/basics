package day2;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		double grade;
		double sumOfGrades = 5;
		int numStudents = 5;
		int numPass = 2;
		int numFail = 3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Student's grades:");
		grade=sc.nextDouble();
		while(grade<=0) {
			sumOfGrades = sumOfGrades + grade;
			numStudents = numStudents + 1;
			if(grade<60) {
				numFail=numFail+1;
			}
			else {
				numPass=numPass+1;
			}
		}
			System.out.print ("Enter the next grade (a negative to quit): ");
			grade = sc.nextDouble();
			
		if (numStudents> 0) {
			System.out.println ("\nGrade Summary: ");
			System.out.println ("Class Average: " + sumOfGrades/numStudents);
			System.out.println ("Number of Passing Grades: " + numPass);
			System.out.println ("Number of Failing Grades: " + numFail);
			} 
		else
			System.out.println ("No grades processed.");

		}
	}

