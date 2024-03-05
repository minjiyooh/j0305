package t1_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t1 = new Test1(); // 힙 메모리에 저장. Test1번을 t1이라 부르겠다.
		Test1 t2 = new Test1(); // 설계도만같을뿐 다른 객체.
														// 힙에 다른주소 들어감. 따로 관리 가능
		if (t1 == t2) { // 수치나 주소가 같을 때 ==
			System.out.println("t1객체와 t2객체는 서로 같은 객체입니다");

		} else {
			System.out.println("t1객체와 t2객체는 서로 다른 객체입니다");

		}

		Test1 t3;
		t3 = t1; // 얕은복사 150이라는 주소를 줌
		if (t1 == t3) { // 수치나 주소가 같을 때 ==
			System.out.println("t1객체와 t3객체는 서로 같은 객체입니다");
		} else {
			System.out.println("t1객체와 t3객체는 서로 다른 객체입니다");
		}
		Test1 t4 = null;
		if (t1 == t4) { // 수치나 주소가 같을 때 ==
			System.out.println("t1객체와 t4객체는 서로 같은 객체입니다");

		} else {
			System.out.println("t1객체와 t4객체는 서로 다른 객체입니다");
		}
		if (t4 == null) {
			System.out.println("t4는 null 입니다.");
		} else {
			System.out.println("t4 null이 아닙니다.");
		}
		
		//null 비교시는 '== / != ' 로 비교해야 한다. 아래는 실행오류 발생
//		if (t4.equals(null)) {
//			System.out.println("t4는 null 입니다.");
//		} else {
//			System.out.println("t4 null이 아닙니다.");
//		}
	}
}
