package java_0119;

class _003StringEx {
	String s3;

	public static void main(String[] args) {
		// java.lang.String : ���ڿ��� ǥ��
		// ���������� �ּҰ��� ������

		int i = 10;
		String s = "���ڿ�";
		String s1 = " ";// ���鵵 ���ڿ��� �ν�
		String s2 = "";// empty String (���ڿ�) �ʱ�ȭ

		String s3 = "100";
		// + �����ڴ� String�� �켱������ ��
		// +�� ������ ��� ��Ģ���� �Ұ���
		String s4 = 100 + s3;

		// String "7"
		String s5 = "" + 7;

		// String " 7"
		String s6 = " " + 7;

		// String "77"
		String s7 = "" + 7 + 7;

		// String "14
		String s8 = 7 + 7 + "";

		// int -> String
		int i_1 = 10;
		String str = i_1 + ""; // int + ""

		// String -> int ���ڷ� �̷���� ���ڿ��� ����
		String str2 = "100";
		int i_2 = Integer.parseInt(str2);

	}

}