package java_0119;

class _002CastingEx {
	public static void main(String[] args) {

		double d = 100;
		int i = 100;

		double d2 = d + i;
		// double ���¸� int ������ �ٲٷ��� �ս��� �߻��ϹǷ� ������ �߻���
		// ����ȯ�� �������־�� ��
		int i2 = (int) (d + i);
		int i3 = (int) d + i;

		System.out.println(d);// 100.0
		System.out.println(i);// 100
		System.out.println(d2);// 200.0
		System.out.println(i2);// 200
		System.out.println(i3);// 200
		
		short s = 10;
		short s1 = 20;
		
		// short + short �� int ������ �ڵ� ����ȯ
		// ��Ģ������ �������� int�� �ڵ� ����ȯ
		// int ���� ū Ÿ���� �� ���� ����
		
		short s2 = (short)(s + s1);
		int s3 = s + s1;
		short s4 = (short)s3;

		
		
		byte b = 10;
		int i_1 = b;
		
		System.out.println(b);
		System.out.println(i_1);
		
		
		int i_2 = 300;
		//������ �ս� �߻� 300->44
		//00000000 00000000 00000001 00101100
		//                         ? 00101100
		
		byte b_2 = (byte)i_2;
		
		System.out.println(i_2);
		System.out.println(b_2);
		
		//�⺻�� ������ ����ȯ ����
		//ū ������ ���� ������ �ٲ� ��, ��������� ��
		
	}

}