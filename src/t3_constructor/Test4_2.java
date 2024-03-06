package t3_constructor;

public class Test4_2 {
	String model;
	String color = "블랙";
	int speed;
	
	Test4_2(String model) { // #1
		this(model,"흰색", 0); 
	}
	
	Test4_2(String model, String color) { // #2
		this(model, color , 250); //this() 현재 클래의 생성자 
		
	}	
		Test4_2(String model, String color ,int speed) { // #2
			this.model = model; //this. 현재필드 
			this.color = color;
			this.speed = 250;
	}
	
}
