package Leson3;

import Lesson2.Printer;

public class Application {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		Thread thread = new Thread(p);
		thread.start();
		
		try {
			thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
	
		for(int h=0;h<50;h++) {
			System.out.println("main" + h);
			
		}
		System.out.println("======================");

	}

}
