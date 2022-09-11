package ThreadBigin;

public class Printers extends Thread{
//	@Override
//	public void start() {
//		super.start();
//		System.out.println("this is stat ");
//	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Child "+currentThread().getName() +" "+ i);
		}
	}

}
