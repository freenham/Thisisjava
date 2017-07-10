package chapter12;

public class Calculator {
	private int memory;

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public synchronized void  setMemory(int memory) {
		this.memory = memory;
		try {
//			Thread.sleep(2000);
			throw new InterruptedException();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + ": "+this.memory);
		}
	}
	
	
}
