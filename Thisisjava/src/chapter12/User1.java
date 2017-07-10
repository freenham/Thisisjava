package chapter12;

public class User1 extends Thread{
	private Calculator caculator;

	/**
	 * @param caculator the caculator to set
	 */
	public void setCaculator(Calculator caculator) {
		this.setName("User1");
		this.caculator = caculator;
	}
	
	@Override
	public void run() {
		caculator.setMemory(100);
	}
	

}
