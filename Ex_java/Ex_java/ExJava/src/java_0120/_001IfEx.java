package java_0120;


class _001IfEx {

	public static void main(String[] args) {
		
		/*
		 * args : 인자, 인수, parameter, arguments
		 * 전달되는 값
		 */
		
		int a = 100;
		/*
		 * str 은 초기화가 안되 있음.
		 * 하지만 밑에 if와 else 로써 조건문에 상관없이
		 * 초기화 해주므로 아래 식은 오류없이 실행됨 
		 * 
		 */
		
		
		
		/*
		 * args[0] : 100 
		 */
		int s = Integer.parseInt(args[0]);
	
		String str;
		
		if(a >= 50){
			str = "50이상";
		}else {
			str = "50미만";
		}
		
		System.out.println(str);
		System.out.println(s);
		
		/*
		 * args[1] : 30
		 */
		a = Integer.parseInt(args[1]);
		if(a >= 41){
			str ="고급";
		}else if(a>=11){
			str ="중급";
		}else if(a>=0){
			str ="초급";
		}else {
			str ="음수";
		}
		
		System.out.println(str);
		
		/*
		 * args [2] : 포도
		 * 
		 * == : 주소값을 비교
		 * equals() : 객체의 값을 비교
		 */
		
		
		String data = args[2];
		String res;
		
		if (data.equals("포도")){
			res = "포도";
		}else if(data.equals("수박")){
			res = "수박";
		}else if(data.equals("딸기")){
			res = "딸기";
		}else {
			res = "기타";
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
			res+="학점";
		}else if((jumsu >=80) && (jumsu<90)){
			res = "B학점";					
		}else if((jumsu >=70) && (jumsu<80)){
			res = "C학점";
		}else if((jumsu >=60) && (jumsu<70)){
			res = "D학점";
		}else if((jumsu >=50) && (jumsu<60)){
			res = "E학점";
		}else {
			res = "FFFFFFFFFFFFFF";
		}
		System.out.println(res);
		
		
		
		/*
		 * 월을 입력하면 해당 월의 끝 날짜를 출력 합니다.
		 * args [4] : 2
		 * 
		 * switch 문의 인수는 byte, short, int , char형만 가능
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
			res = "해당 없음";
		
		}
		System.out.println(month+"월은 "+ res+"일입니다");
		
		
		
	}

}
