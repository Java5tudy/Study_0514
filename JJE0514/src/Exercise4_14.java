

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		Scanner S = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			input = S.nextInt();
			
			if(input != answer) {
				continue;
			}else {
				break;
			}
		}while (true);
		System.out.println("������ϴ�.");
		System.out.println("�õ�Ƚ���� "+ count +"���Դϴ�.");
	}
}
