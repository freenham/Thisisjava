package chapter12;

public class User2 extends Thread{
	private Calculator caculator;

	/**
	 * @param caculator the caculator to set
	 */
	public void setCaculator(Calculator caculator) {
		this.setName("User2");
		this.caculator = caculator;
	}
	
	@Override
	public void run() {
		caculator.setMemory(50);
	}
	

}
