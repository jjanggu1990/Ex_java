package java_0119;

class _002CastingEx {
	public static void main (String [] args){
		
		
		double d = 100;
		int i = 100;
		
		double d2 = d+i;
		//double 형태를 int 형으로 바꾸려면 손실이 발생하므로 오류가 발생함
		//형변환을 실행해주어야 함
		int i2 = (int)(d+i);
//		int i2 = (int)d+i;
				
		System.out.println(d);//100.0
		System.out.println(i);//100
		System.out.println(d2);//200.0
		System.out.println(i2);//200
	}

}
