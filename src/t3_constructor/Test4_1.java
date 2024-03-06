package t3_constructor;

public class Test4_1 {
	String model;
	String color = "블랙";
	int speed;
	
	Test4_1(String model) { // #1
		this.model = model;
		this.color = "흰색";
		this.speed = 250;
	}
	
	Test4_1(String model, String color) { // #2
		this.model = model;
		this.color = color;
		this.speed = 250;
	}	
		Test4_1(String model, String color ,int speed) { // #2
			this.model = model;
			this.color = color;
			this.speed = 250;
	}
	
}
