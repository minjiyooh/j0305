package t1_class;

//클래스 안에서만 선언 가능
public class Test5_val {
	//
	public static void main(String[] args) {
		int su1 = 100, su3; // 글로벌 변수

		for (int i = 0; i < 5; i++) {
			int su2 = 200 * 1;
			System.out.println(su1 + su2); // 블럭안에 선언한 변수는 로컬/지역 변수
		}

		// su3 = su1 + su2
	}

}
