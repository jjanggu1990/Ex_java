package java_0120;


class _001IfEx {

	public static void main(String[] args) {
		
		/*
		 * args : ����, �μ�, parameter, arguments
		 * ���޵Ǵ� ��
		 */
		
		int a = 100;
		/*
		 * str �� �ʱ�ȭ�� �ȵ� ����.
		 * ������ �ؿ� if�� else �ν� ���ǹ��� �������
		 * �ʱ�ȭ ���ֹǷ� �Ʒ� ���� �������� ����� 
		 * 
		 */
		
		
		
		/*
		 * args[0] : 100 
		 */
		int s = Integer.parseInt(args[0]);
	
		String str;
		
		if(a >= 50){
			str = "50�̻�";
		}else {
			str = "50�̸�";
		}
		
		System.out.println(str);
		System.out.println(s);
		
		/*
		 * args[1] : 30
		 */
		a = Integer.parseInt(args[1]);
		if(a >= 41){
			str ="����";
		}else if(a>=11){
			str ="�߱�";
		}else if(a>=0){
			str ="�ʱ�";
		}else {
			str ="����";
		}
		
		System.out.println(str);
		
		/*
		 * args [2] : ����
		 * 
		 * == : �ּҰ��� ��
		 * equals() : ��ü�� ���� ��
		 */
		
		
		String data = args[2];
		String res;
		
		if (data.equals("����")){
			res = "����";
		}else if(data.equals("����")){
			res = "����";
		}else if(data.equals("����")){
			res = "����";
		}else {
			res = "��Ÿ";
		}
		
		System.out.println(res);
		
		
		/*
		 * args[3] : 99
		 */
		
		int jumsu = Integer.parseInt(args[3]);
		
		if((jumsu >=90) && (jumsu<=100)){
			res = "A";
			if((jumsu >=90) && (jumsu<93)){
				res += "-";
			}else if((jumsu >=98) && (jumsu<=100)){
				res += "+";
			}
			res+="����";
		}else if((jumsu >=80) && (jumsu<90)){
			res = "B����";					
		}else if((jumsu >=70) && (jumsu<80)){
			res = "C����";
		}else if((jumsu >=60) && (jumsu<70)){
			res = "D����";
		}else if((jumsu >=50) && (jumsu<60)){
			res = "E����";
		}else {
			res = "FFFFFFFFFFFFFF";
		}
		System.out.println(res);
		
		
		
		/*
		 * ���� �Է��ϸ� �ش� ���� �� ��¥�� ��� �մϴ�.
		 * args [4] : 2
		 * 
		 * switch ���� �μ��� byte, short, int , char���� ����
		 * 
		 */
		
		int month = Integer.parseInt(args[4]);
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case  12:
			res = "31"; break;
		case 4: case 6: case 9: case 11:
			res = "30"; break;
		case 2:
			res = "28"; break;
		default:
			res = "�ش� ����";
		
		}
		System.out.println(month+"���� "+ res+"���Դϴ�");
		
		
		
	}

}