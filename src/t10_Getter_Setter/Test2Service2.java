package t10_Getter_Setter;


public class Test2Service2 {

	public String setGenderCheck(int sex) {
		if(sex == 1 || sex == 3)return "남자";
		else return "여자"; 
	}

	
	public void print(Test2VO2 vo) {
		System.out.println("=====>>등록된 신상정보입니다.");
		System.out.println("성명 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println("성별 : " + vo.getStrGender());

	}
	
	
	





	
}