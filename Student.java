package org.system;

public class Student {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student id : " + id);		
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Studend id : " +id+ " and name : " + name);
	}
	
	public void getStudentInfo(String email, int phoneNum) {
		
		System.out.println("Student email : "+email+ " and phoneNumber : "+phoneNum);
	}
	
	public static void main(String args[]) {
		
		Student obj = new Student();
		obj.getStudentInfo(52);
		obj.getStudentInfo(47, "Sendur");
		obj.getStudentInfo("sendr@gmail.com", 95465122);
	}

}
 