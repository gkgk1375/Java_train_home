package chap06_1;

public class Car {
	//필드
	String company = "현대자동차"; //기본값
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
		
	}
	Car(String model) {
		this(model, "은색", 250); //기본값으로 속도를 250으로 고정한거
	}
	
	Car(String model, String color) {
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
