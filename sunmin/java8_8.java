import java.util.InputMismatchException;
import java.util.Scanner;
//다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다. 
//예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라. 
public class java8_8 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0; 
		
		
			do {
				try {
					count++;
					System.out.print("1 과 100 사이의 값을 입력하세요 :"); 
					input = new Scanner(System.in).nextInt(); 
				}
				catch(InputMismatchException e) {
					e.getMessage();
					System.out.println("숫자가 아닙니다.숫자를 다시 입력해주세요.");
				}
					
					if(answer > input) {
					System.out.println(" 더 큰 수를 입력하세요 ."); 
					} 
					else if(answer < input) { 
						System.out.println("더 작은 수를 입력하세요  .");
					} 
					else { 
						System.out.println(" 맞췄습니다."); 
						System.out.println("시도횟수는  "+count+" 번입니다 ."); 
						break; 
				}
				
			}while(true); 
	}
}

