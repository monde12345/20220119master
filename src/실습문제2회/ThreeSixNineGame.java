package �ǽ�����2ȸ;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
	//�غ�ܰ�
	String inputNum; //�Է��ϴ� ��ǲ
	int count = 0; //�����Ǵ� ������ 0���� �ش�.
	int noOf369_count = 0;
	
	//�Է´ܰ�
	System.out.println("1~9999 ������ ���� �Է��ϼ���>>> ");
	Scanner scan = new Scanner(System.in);
	inputNum = scan.next();
	
	//ó�� �ܰ�
	if (inputNum.length() <=4) {
		for (int i=0; i<inputNum.length();i++) {
		if(inputNum.charAt(i)-48 == 3 || inputNum.charAt(i)-48==6|| 
										 inputNum.charAt(i)-48==9) {
		count =count +1;					
		}		
		if (inputNum.charAt(i) - 48 !=3 || inputNum.charAt(i) -48 !=6|| inputNum.charAt(i) -48 !=9) {
		noOf369_count = noOf369_count + 1;
	 }
    }		
  }		
	if(count > 0) {
		System.out.print("�ڼ�");
		for (int j=0; j < count; j++) {
			System.out.print("¦");
		}
	
	}		
	if(noOf369_count >0 && count == 0) {
		System.out.println("�Էµ� ���� 3,6,9�� �����ϴ�.");
	}
 
  if(inputNum.length() > 4) {
		System.out.println("�Էµ� ���� ������ �ʰ��߽��ϴ�.");
	
	}
	
	}
	}

	