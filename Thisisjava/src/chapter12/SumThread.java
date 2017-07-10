package chapter12;

public class SumThread extends Thread{
	private long sum;

	/**
	 * @return the sum
	 */
	public long getSum() {
		return sum;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(long sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			sum += i;
		}
	}
	

}
