package 실습문제2회;

import java.util.Scanner;

public class JuminNumProcess {
//키보드로 입력받은 주민등록번호에서 문자열을 하이픈('-')으로 분리하여 주민번호 앞자리 6자리만(즉 생년월일) 출력,
	//뒤  7자리만 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
	//준비 단계=> 변수 선언, 배열 선언=> 메모리의 일부(그릇)를
	String juminNum;  //키보드로부터 입력한 주민번호 문자열 객체의 주소 값이 담겨질 객체 참조변수	
	
	//입력 단계
	System.out.print("주민번호 입력:>>> ");
	Scanner scan = new Scanner(System.in);
	
	juminNum =scan.next(); //표준입력장치
	
	//처리 단계  //제어문들의 조합(if문, 스위치 문,for문,while문, continue, break)=>로직
	//logic=> 인간의 논리적인 사고=> 주어진 문제를 어떻게 해결 할 것 인지 고민?
	String frontJumiNum =juminNum.substring(0, 6);
	String backJuminNum =juminNum.substring(7, 14);
	//[해결 방법]
	System.out.println("주민번호 앞 6자리: +" + frontJumiNum);//객체가 저장 되어있는 주소 값이다.
	System.out.println(" 주민번호 뒤 7자리: " + backJuminNum);
		
	String[] token =juminNum.split("-");
			String frontString = token[0];
			String backString = token[1];
			
			//[중요] 실무 사례
			//"971025-1054171" => "971025-1******" => 마스킹(masking)처리
			String juminNumMasking = backString.replace(backString.substring(1), "******"); //중첩 메소드
			
			System.out.println("<< 주민번호 뒤 자리 마스킹처리하기 >>");
			System.out.println(frontString + "-" + juminNumMasking);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


