package �ǽ�����2ȸ;

import java.util.Scanner;

public class JuminNumProcess {
//Ű����� �Է¹��� �ֹε�Ϲ�ȣ���� ���ڿ��� ������('-')���� �и��Ͽ� �ֹι�ȣ ���ڸ� 6�ڸ���(�� �������) ���,
	//��  7�ڸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
	public static void main(String[] args) {
	//�غ� �ܰ�=> ���� ����, �迭 ����=> �޸��� �Ϻ�(�׸�)��
	String juminNum;  //Ű����κ��� �Է��� �ֹι�ȣ ���ڿ� ��ü�� �ּ� ���� ����� ��ü ��������	
	
	//�Է� �ܰ�
	System.out.print("�ֹι�ȣ �Է�:>>> ");
	Scanner scan = new Scanner(System.in);
	
	juminNum =scan.next(); //ǥ���Է���ġ
	
	//ó�� �ܰ�  //������� ����(if��, ����ġ ��,for��,while��, continue, break)=>����
	//logic=> �ΰ��� ������ ���=> �־��� ������ ��� �ذ� �� �� ���� ���?
	String frontJumiNum =juminNum.substring(0, 6);
	String backJuminNum =juminNum.substring(7, 14);
	//[�ذ� ���]
	System.out.println("�ֹι�ȣ �� 6�ڸ�: +" + frontJumiNum);//��ü�� ���� �Ǿ��ִ� �ּ� ���̴�.
	System.out.println(" �ֹι�ȣ �� 7�ڸ�: " + backJuminNum);
		
	String[] token =juminNum.split("-");
			String frontString = token[0];
			String backString = token[1];
			
			//[�߿�] �ǹ� ���
			//"971025-1054171" => "971025-1******" => ����ŷ(masking)ó��
			String juminNumMasking = backString.replace(backString.substring(1), "******"); //��ø �޼ҵ�
			
			System.out.println("<< �ֹι�ȣ �� �ڸ� ����ŷó���ϱ� >>");
			System.out.println(frontString + "-" + juminNumMasking);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


