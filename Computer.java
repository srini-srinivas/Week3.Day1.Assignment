package org.system;

class Computer1 {
	
	public void computerModel()
	{
		System.out.println("This is my computer model");
	}

}

class Desktop extends Computer1{
	
	public void desktopSize() {
			
			System.out.println("My desktop size is 10");
		}
}

class Computer{
	
	public static void main(String args[]) {
		
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}