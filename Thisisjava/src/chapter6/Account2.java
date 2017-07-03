package chapter6;

public class Account2 {
	private String ano;
	private String owner;
	private int balance;
	
	public Account2(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	/**
	 * @return the ano
	 */
	public String getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(String ano) {
		this.ano = ano;
	}

	/**
	 * @return the onwer
	 */
	public String getOnwer() {
		return owner;
	}

	/**
	 * @param onwer the onwer to set
	 */
	public void setOnwer(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
