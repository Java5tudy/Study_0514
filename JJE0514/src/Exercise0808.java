import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise0808 {
	public static void main(String[] args) {
		
		// 1~100������ ���ǰ��� answer�� ����
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1�� 100 ������ ���� �Է��ϼ���.");
			
			try {
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("��� �Է��ϼ���");
				input = new Scanner(System.in).nextInt();
				return;
			}
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("������ϴ�.");
				System.out.println("�õ� Ø���� " + count +"�� �Դϴ�.");
				break;
			}
		}while(true);
	}

	private static void extracted() {
		return;
	}

}
