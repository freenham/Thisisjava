package chapter6;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hankook.Tire;
import sec12.exam03_import_hyundai.Engine;

public class Car {
	String company = "현대";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	Tire tire = new Tire();

}
