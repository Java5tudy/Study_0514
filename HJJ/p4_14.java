
public class p4_14 {

	public static void main(String[] args) {
		//1~100������ ������ ���� �� answer �� �����Ѵ�
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println(("1�� 100������ ���� �Է��ϼ���"));
			input = s.nextInt(); //�Է¹��� ���� ���� input�� �����Ѵ�
			
			if(answer > input) {
				System.out.println("up");
			}else if(answer < input) {
				System.out.println("down");
			}else {
				System.out.println("�����Դϴ�");
				System.out.println(count +"������ ���� �Է� �ϼ̽��ϴ�");
				break;
				
			}
		} while(true);
		
	}

}
