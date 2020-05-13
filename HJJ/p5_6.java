
public class p5_6 {

	public static void main(String[] args) {
		// 큰금액 우선
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]); // 나누면 지불할 동전의 갯수
	        money %= coinUnit[i]; // 지불하고 남은 금액
			 
		}
	}

}
