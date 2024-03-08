package t8_static;

public class T1 {

	// 인스턴스 필드
	// double pi = 3.141592;

	// 정적필드
	public static double pi = Math.PI;

	// 인스턴스 메소드
	static double circleArea(int r) {
		double pi = 3.141592;
		double res = r * r * pi;
		return res;

	}

}
