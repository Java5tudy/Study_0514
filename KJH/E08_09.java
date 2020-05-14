package may0514;
//object > Throwable > Exception > RuntimeException > ArithmeticException
//runtimeexception�� ��üũ���� / ��������� ���� ���� �ǵ������� ���� �߻��ϱ� ���� �޼ҵ�
class UnsupportedFunctionException extends RuntimeException {
	final private int ERR_CODE = 100;
	
	UnsupportedFunctionException() {
		super(); // ���� �޼ҵ忡�� ������ �� �ֵ��� ����
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
		throw new UnsupportedFunctionException ("�������� �ʴ� ����Դϴ�.", 100); // ������ ���� �߻�
	}
}
