import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise0808 {
	public static void main(String[] args) {
		
		// 1~100사이의 임의값얻어서 answer에 저장
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요.");
			
			try {
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("디시 입력하세요");
				input = new Scanner(System.in).nextInt();
				return;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맛췄습니다.");
				System.out.println("시도 횠누는 " + count +"번 입니다.");
				break;
			}
		}while(true);
	}

	private static void extracted() {
		return;
	}

}
