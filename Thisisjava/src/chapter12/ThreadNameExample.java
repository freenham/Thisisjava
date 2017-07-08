package chapter12;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getName());
		
		Thread threadA = new ThreadA();
		threadA.start();
		
		
		Thread threadB = new ThreadB();
		if(threadA.getState().equals(Thread.State.TERMINATED))
		threadB.start();
	}
}
