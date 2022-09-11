package Leson4;

import Lesson2.Printer;

public class Aplication {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		Thread thread = new Thread(p);
		thread.start();
		
		
		for(int h=0;h<50;h++) {
			System.out.println("main" + h);
			
		}
		System.out.println("======================");
		//thread.interrupt();

	}

}
