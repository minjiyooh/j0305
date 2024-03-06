package t3_constructor;

public class Test3 {
	// 기본생성자
	Test3() {}	// #1
	
	int atom = 30;
	int atom2;
	double atom3;
	
	Test3(int su1) {	// #2
		System.out.println("su1 : " + su1);
	}
	
	Test3(int su1, int su2) { // #3
		atom = su1;
		atom2 = su2;
	}
	
	Test3(int atom, double atom3) {	// #4 해커들의 침입을 방지하기위해 
		                              //필드에 값을 안주고 매개 변수에 값을준다
	this.atom = atom; //this 라는 예약어를 넣으면 필드값을 줌 
	this.atom3 = atom;
	}
	
	Test3(double su2, int su1) {}
	
	// Test2(int atom1, int atom2) {}
}
