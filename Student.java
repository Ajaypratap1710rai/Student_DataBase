package studentdatabseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int classLevel;
	private String studentid;
	private String courses = null;
	private int tutionBalance;
	private static int costofCources = 599;
	private static int id = 1000;
	
	//Constructor:-Student & Year 
	public Student() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Student FirstName :- ");
		this.firstName = in.nextLine();
		
		
		System.out.print("Enter Student LastName :- ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freher\n2 - Junior\n3 - Senior\nEnter Student Class Level :- ");
		this.classLevel = in.nextInt();
		
		setStdId();
		
		//System.out.println(firstName + " " +lastName + " " + classLevel + " " + studentid);
		
	}
	
	//Generate Id
	private void setStdId() {
		//Setstdid :- classlevel + id
		id++;
		this.studentid = classLevel + "" + id;
		
	}
	
	//Enroll Courses
	public void enroll() {
		do {
			System.out.print("Enter courses to enroll (A for exit):- ");
			Scanner sc=new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("A")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costofCources;
			}
			else {
				//System.out.println("Break ! ");
				break;
			}
		}while(1 != 0);	
		//System.out.println("Enrolled In:- " + courses);
		//System.out.println("Tutution Balanace:- " + tutionBalance);
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your Balance is : $" + tutionBalance);
	}
	
	//Pay tutuion Fees
	public void payTutition() {
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your amount for payment : $");
		int payment=in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	//Show Info
	public String showInfo() {
		return "Name is " + firstName + " "  + lastName + 
				"\nCLass Level :-" + classLevel +
				"\nStudent Id :-" + studentid+
				"\nCourses Enrolled :- " + courses +
				"\nBalance is :$" + tutionBalance;
	}
}



