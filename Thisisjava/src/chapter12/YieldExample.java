package chapter12;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadAA threadA = new ThreadAA();
		ThreadBB threadB = new ThreadBB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
			threadA.work= false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		try {
			Thread.sleep(3000);
			threadA.work= true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
		threadA.stop = true;
		threadB.stop = true;
	}

}
