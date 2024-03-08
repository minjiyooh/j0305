package t8_static;

//생성할때만 final
//final로 선언할거면 생성자를 만들어야 사용할 수 있다.




public class T3_final2 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
//	public T3_final2() {}
	
	T3_final2(String jumin) {
		this.jumin = jumin;
	}
	
	public String getNation() {
		return nation;
	}
}
