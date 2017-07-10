package chapter12;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCaculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCaculator(calculator);
		user2.start();
		
		
	}

}
