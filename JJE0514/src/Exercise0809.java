//import java.lang.Throwable;

//class RuntiemException extends Exception{//����Ʋ���� 
//	private String Massage;
	
//	public RuntiemException(String Massage) {
//		this.Massage = Massage;
//	} 
//}

class UnsupportedFunctionException extends RuntimeException {
	
	private final int ERR_CODE;
	
	UnsupportedFunctionException(String Massage, int ERR_CODE) { //������ 
		super(Massage);
		this.ERR_CODE = ERR_CODE;
	}
    UnsupportedFunctionException(String Massage) {//������2
		this(Massage, 100);
	}
	public int getErrorCode(){ //�����ڵ� ��ȯ�޼��� 
		return ERR_CODE;
	}
	public String getMassage() { //�޼��� ���� ��ȯ�޼ҵ�
		return "[" + getErrorCode()+ "]" + super.getMessage(); //���� Ŭ���� �޼ҵ�
	}
}
public class Exercise0809 {

	public static void main(String[] args) throws Exception{
		throw new UnsupportedFunctionException("�������� �ʴ� ����Դϴ�.", 10);
	}
}
