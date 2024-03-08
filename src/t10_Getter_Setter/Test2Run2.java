package t10_Getter_Setter;

import java.util.Scanner;

/*
'성명/나이/지역/성별'을 입력받아 정보를 '저장/출력' 학좌 한다.
나이는 15세 이상 70세 미만인 사람만 가입할 수 있고,
주소의 입력시 '외국인'은 0으로 입력된다.
성별은 '남자는 1,3' 여자는 '2,4'로 입력처리후 , 저장은 '남자/여자'로 저장한다.
*/
public class Test2Run2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2VO2 vo = new Test2VO2();

		System.out.print("성명을 입력하세요? ");
		vo.setName(sc.next());
		System.out.print("나이를 입력하세요? ");
		vo.setAge(sc.nextInt());
		System.out.print("주소를 입력하세요? (외국인은 0)");
		vo.setAddress(sc.next());

		Test2Service2 service = new Test2Service2();
		System.out.print("성별을 입력하세요? 남자는 1,3 여자는 2,4");
		int sex = sc.nextInt();
		
		vo.setStrGender(service.setGenderCheck(sex));

		service.print(vo);
		
		sc.close();
	}

}
