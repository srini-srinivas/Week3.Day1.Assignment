package org.system;

class College {
	
	public void collegeName() {
		System.out.println("The college name is : SKR");
	}
	
	public void collegeCode() {
		System.out.println("The college code is : 2021");
	}
	
	public void collegeRank() {
		System.out.println("The college rank is : 42");
	}
}

class Department extends College{
	
	public void departmentName() {
		System.out.println("The department name is : CSE");
	}
}

class Students extends Department{
	
	public void studentName(){
		System.out.println("The student name is : Ajith");
	}
	
	public void studentDept(){
		System.out.println("The student Department is : CSE");
	}
	
	public void studentID(){
		System.out.println("The student ID is : 03");
	}
}

class CollegeStudent{
	
	public static void main(String args[]) {
		
		Students obj = new Students();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.departmentName();
		obj.studentName();
		obj.studentDept();
		obj.studentID();
	}
}
