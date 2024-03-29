package t6_exam;

import java.util.Scanner;

public class Test_objRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test_objService service = new Test_objService();
		Test_objVO[] data = new Test_objVO[100];
		
		int cnt = 0;
		
		Test_objVO vo = new Test_objVO();
		while(true) {
			System.out.print("아이디를 입력하세요? ");
			vo.setMid(sc.next());
			System.out.print("비밀번호를 입력하세요? ");
			vo.setPwd(sc.next());
			System.out.print("성명을 입력하세요? ");
			vo.setName(sc.next());
			System.out.print("나이를 입력하세요? ");
			vo.setAge(sc.nextInt());
			
			// 처리할 내용들을 service객체에서 처리시켜준다.
			vo.setAdult(service.adultCheck(vo.getAge()));
			
			// 처리된 자료를 배열에 저장한다.
			data[cnt] = vo;
			cnt++;
			
			System.out.println("계속 할까요?(Y/N) ");
			String yn = sc.next().toUpperCase();
			if(yn.equals("N")) break;
		}
		// 배열에 저장된 자료를 출력처리한다.
		service.memberPrint(data, cnt);
		
		sc.close();
	}
}
