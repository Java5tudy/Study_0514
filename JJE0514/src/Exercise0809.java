//import java.lang.Throwable;

//class RuntiemException extends Exception{//조상틀래스 
//	private String Massage;
	
//	public RuntiemException(String Massage) {
//		this.Massage = Massage;
//	} 
//}

class UnsupportedFunctionException extends RuntimeException {
	
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String Massage, int ERR_CODE) { //생성자 
		super(Massage);
		this.ERR_CODE = ERR_CODE;
	}
    UnsupportedFunctionException(String Massage) {//생성자2
		this(Massage, 100);
	}
	public int getErrorCode(){ //에러코드 반환메서드 
		return ERR_CODE;
	}
	public String getMassage() { //메세지 내용 반환메소드
		return "[" + getErrorCode()+ "]" + super.getMessage(); //예외 클라스으 메소드
	}
}
public class Exercise0809 {

	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 10);
	}
}
