package chapter12;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkObject sharedObject = new WorkObject();
		
		ThreadA3 threadA = new ThreadA3(sharedObject);
		ThreadB3 threadB = new ThreadB3(sharedObject);
		
		threadA.start();
		threadB.start();
		
		
	}

}
