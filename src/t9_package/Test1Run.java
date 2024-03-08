package t9_package;

import t4_method.Calculator;
import t4_method.Test2_1;
import t4_method.Test3_1;

//import t4_method.*;
// * 은 모든 클래스를 다 창조하겠다 라는 뜻.
// 가능한 클래스 이름을 써주는게 좋다.

public class Test1Run {
	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println("1. 번호 : " + t1.getNo());
		System.out.println("1. 성명 : " + t1.getName());

		t1.setNo(10);
		t1.setName("홍길동");

		System.out.println("2. 번호 : " + t1.getNo());
		System.out.println("2. 성명 : " + t1.getName());

		System.out.println("t8_static.T1의 PI : " + t8_static.T1.pi);

		
		
		
		t7_instance.Test1 t7 = new t7_instance.Test1();
		System.out.println("t7_instance.T1의 PI : " + t7.pi);
		
		new Calculator();
		new Test2_1();
		new Test3_1();
	}
}
