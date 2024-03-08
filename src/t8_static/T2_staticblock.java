package t8_static;

public class T2_staticblock {

	int field1;
	static int field2;

	void method1() {
	}

	static void method2() {
	}

	// 정적 블록
	static {

		field2 = 200;

		method2();

		// method1
		// field1

	}

}
