package java_0120;

import java.util.concurrent.SynchronousQueue;

class _002ForEx {

	public static void main(String[] args) {
		
		/*
		 * 0���� �μ��� �Է��� �������� ��
		 * 
		 * args[0] : 15
		 */
		
		int i;
		int sum=0;
		int arg_num = Integer.parseInt(args[0]);
		
		for (i = 0; i<=arg_num; i++){
			sum+=i;
			System.out.print(sum+" ");
		}
		System.out.println("\n"+sum);
		
		
		
		System.out.println("\n\n ������ ���");
		/*
		 * ������ ���
		 * 
		 * args[1] : 2
		 * �μ��� ���� ���� �ܼ��� �̿�
		 * 1���� ������� �����, 9���� �������� ���
		 * 
		 * 
		 */
		
		int num_dan = Integer.parseInt(args[1]);
		/*
		int j =9;
		for(i =1;i<19;i++){
			if(i>=10){
				System.out.println(num_dan+" x "+j+" = "+(num_dan * j));
				j--;
				continue;
			}
			System.out.println(num_dan+" x "+i+" = "+(num_dan * i));
		}
		*/
		for(i=1;i<10;i++){
			System.out.println(num_dan+" x "+i+" = "+ (num_dan * i));
		}
		System.out.println();
		for(i=9;i>0;i--){
			System.out.println(num_dan+" x "+i+" = "+(num_dan * i));
		}
		
		
		/*
		 * 
		 * ���� for ����
		 * �ƽ�Ű�ڵ尪 65 : 'A'
		 * �ƽ�Ű�ڵ尪 97 : 'a'
		 * \t : tab Ű
		 */
		System.out.println("\n\n ���� for ����");
		char ch = 65;
		for (i =0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(ch++ +"\t");
			}
			System.out.println();
		}
		System.out.println(ch);
		
		
		
		/*
		 * for ���� �̿��ؼ� ¦���� ����ϱ�
		 * args[2] : 11
		 * �μ��� �Է� ���� ���ڱ���
		 * 
		 */
		int n = Integer.parseInt(args[2]);
		for (i =0 ; i<=n;i++){
			if((i%2)==0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for(i=0; i<=n; i+=2){
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(i=0; i<=(n/2);i++){
			System.out.print(i*2+" ");
		}
		
		/*
		 * while �� ����
		 * args[3] : 
		 */
		
		System.out.println("\n\nwhile �� ����");
		sum = i = 0;
		int j = Integer.parseInt(args[3]);
		while(i<=j){
			sum += i;
			i++;
		}
		System.out.println("1~"+ j + "������ �� : " + sum);
		
		
		/*
		 * do while �� ����
		 * while �� �Ĺ̿� ; ���� �ʰ� ���
		 * 
		 */
		System.out.println("\n\ndo while �� ����");
		i = 5;
		String str = "Java DoublePlus";
		do{
			System.out.println(str);
		}while(i-- > 10);
		
		
		/*
		 * 
		 * break ����
		 * label : �ݺ����� �̸��� ���̴� ��
		 * 
		 */
		System.out.println("\n\nbreak ����");
		label: 
			for(i = 0;i<3;i++){
				for(j = 0; j<5;j++){
					if (j==3)
						break label;
					System.out.println("i�� : " + i + "  j�� : "+j);
				}
			}
		
		
		/*
		 * continue ����
		 * continue �� break �� ������ ������ ó�� ����
		 */
		System.out.println("\n\ncontinue �� ����");
		for(i = 0;i<10;i++){
			if (i%4 != 0)
				continue;
			System.out.println("i�� : " + i);
		}
		System.out.println("\n\nlebel�� ���� continue");
		label: 
			for(i = 0;i<5;i++){
				for(j = 0; j<5;j++){
					if (j==3)
						continue label;
					System.out.println("i�� : " + i + "  j�� : "+j);
				}
			}
		
		
		
		
	}
}