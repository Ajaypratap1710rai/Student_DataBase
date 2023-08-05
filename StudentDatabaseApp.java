package studentdatabseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
//		Student std1 = new Student();
//		std1.enroll();
//		std1.payTutition();
//		System.out.println(std1.showInfo());
		
		//Ask how many Student we want to add
		System.out.print("Enter number of New Student to Enroll :- ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudent = sc.nextInt();
		Student student[]= new Student[numberOfStudent-1];
		
		//Create Number of New Student
		for(int n=0;n<numberOfStudent;n++) {
			//Student std = new Student();
			student[n] = new Student();
			student[n].enroll();
			student[n].payTutition();
			
		}
		for(int n=0;n<numberOfStudent;n++) {
			System.out.println(student[n].showInfo());
		}
	}
}
