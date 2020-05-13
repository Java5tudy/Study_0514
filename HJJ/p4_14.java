
public class p4_14 {

	public static void main(String[] args) {
		//1~100사이의 임의의 값을 얻어서 answer 에 저장한다
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println(("1과 100사이의 값을 입력하세요"));
			input = s.nextInt(); //입력받은 값을 변수 input에 저장한다
			
			if(answer > input) {
				System.out.println("up");
			}else if(answer < input) {
				System.out.println("down");
			}else {
				System.out.println("정답입니다");
				System.out.println(count +"번만에 정답 입력 하셨습니다");
				break;
				
			}
		} while(true);
		
	}

}
