
//다음과 같은 조건의 예회클래스를 작성하고 테스트하시오.
//참고: 생성자는 실험결과를 보고 알맞게 작성해야한다.

	
class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE=100;
	private String str;
	
	public UnsupportedFuctionException(String str, int n) {
		this.str=str;
		n= ERR_CODE;
	}

	public int getErrorCode() { //Error Code반환 메서드
		return ERR_CODE;
	}

	public String getMessage() { //Message 반환
		return "["+getErrorCode()+"]"+str;
	}
	
}
public class java8_9 {
	public static void main(String[] args) {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);

	}

}
