package t3_constructor;

public class Test2 {
	//기본 생성자
	Test2()  {} // 이게 없을 때 컴파일러가 안만듦
	
	Test2(int su1){} //타입 개수 순서로 구분을 준다
	
	Test2(int su1, int su2){} 

	Test2(int su1, double su2){}
	
	Test2(double su2, int su1){} //순서를 다르게 해서 가능
	
	// Test2(int su2, int su1){} // 안되는 이유: 변수명은 상관없음 ! 타입만 달라야함
}
