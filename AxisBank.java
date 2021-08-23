package org.system;

class BankInfo {
	
	public void savings() {
		System.out.println("Enter Savings");
	}
	
	public void fixed() {
		System.out.println("Enter fixed");
	}
	
	public void deposit() {
		System.out.println("Enter deposit");
	}
}

class AxisBank extends BankInfo {
	
	public void deposit() {
			System.out.println("Enter the amount");
		}
	
	public static void main(String args[]) {
		
		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
	}
}