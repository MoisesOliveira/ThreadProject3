package controller;

public class Main {

	public static void main(String[] args) {

		Thread frog0 = new FrogController(20);
		Thread frog1 = new FrogController(20);
		Thread frog2 = new FrogController(20);
		Thread frog3 = new FrogController(20);
		Thread frog4 = new FrogController(20);
		
		frog0.start();
		frog1.start();
		frog2.start();
		frog3.start();
		frog4.start();
	}

}
