package Leson4;

public class Printer implements Runnable {
	@Override
	public void run() {
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			System.out.println("I am up......!");
		}
		
		
		for(int i=0; i<50;i++) {
			
			
			System.out.println("child"+" " + i);
		}
	}

}
