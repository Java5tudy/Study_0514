package may0514;
//object > Throwable > Exception > RuntimeException > ArithmeticException
//runtimeexception은 언체크예외 / 선언따로할 이유 없음 의도적으로 오류 발생하기 위한 메소드
class UnsupportedFunctionException extends RuntimeException {
	final private int ERR_CODE = 100; //final 설정시 초깃값 설정을 해줘야 한다.
	
	UnsupportedFunctionException() {
		super(); // 상위 메소드에서 저장할 수 있도록 설정
	}
	
	UnsupportedFunctionException(String message, int x) {
		super(message);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "["+ getErrorCode() +"]"+super.getMessage();
	}
}


public class E08_09 {
	public static void main(String[] args) {
		throw new UnsupportedFunctionException ("지원하지 않는 기능입니다.", 100); // 무조건 에러 발생
	}
}
