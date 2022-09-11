package Lesson2;

public class Application {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		System.out.println("Main before p " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		
		Thread thread = new Thread(p);
		
		thread.setPriority(7);
		
		System.out.println("Main p " + Thread.currentThread().getPriority());
		System.out.println("child p" + thread.getPriority());
		
		thread.start();
		
		for(int h=0;h<50;h++) {
			System.out.println("main" + h);
		}
		System.out.println("======================");

	}

}
