package chapter12;

public class ThreadBB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadBB의 작업내용");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadBB의 종료");
	}

}
