
//������ ���� ������ ��ȸŬ������ �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//����: �����ڴ� �������� ���� �˸°� �ۼ��ؾ��Ѵ�.

	
class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE=100;
	private String str;
	
	public UnsupportedFuctionException(String str, int n) {
		this.str=str;
		n= ERR_CODE;
	}

	public int getErrorCode() { //Error Code��ȯ �޼���
		return ERR_CODE;
	}

	public String getMessage() { //Message ��ȯ
		return "["+getErrorCode()+"]"+str;
	}
	
}
public class java8_9 {
	public static void main(String[] args) {
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100);

	}

}
