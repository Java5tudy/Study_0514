package may0514;
import java.util.*;
public class E08_08 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		
		do {
			
			count++;
			System.out.print("1�� 100������ ���� �Է��϶� : ");
			
			try {
						
				input = new Scanner(System.in).nextInt();
			
			
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}
			else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
			else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}
			}
			
			catch (InputMismatchException e) {
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է��� �ּ���");
			}
		
		}while(true);
	}
}
