

public class Exercise4_13 {
	public static void main(String[] args) {
		String Value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�. 
		
		for(int i=0; i<Value.length(); i++) {
			ch = Value.charAt(i);
			if((int)ch < 48 && (int)ch > 57 )
				continue;
			else {
				isNumber = false;
				break;
			}
		}
		if(isNumber) {
			System.out.println(Value + "�� �����Դϴ�.");
		} else {
			System.out.println(Value + "�� ���ڰ� �ƴմϴ�. ");
		}
	}

}
