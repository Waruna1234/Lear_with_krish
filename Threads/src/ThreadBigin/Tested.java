package ThreadBigin;

import java.util.Currency;

public class Tested {

	public static void main(String[] args) {
		Printers p =new Printers();
		p.setDaemon(true);
		p.start();
		
		for(int i =0;i<100;i++) {
			System.out.println("main "+Thread.currentThread().getName() +" " +i);
		}
		System.out.println("============================");
	}
 
}
