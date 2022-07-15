package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
		double c = b;		//문자-정수-실수
							// 낮        높
							//문자에서 바로 실수로는 못감. 순서대로 감
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c; // 낮출땐 명시를 해야함
		char e = (char) d;
		System.out.println(d);
		System.out.println(e);
		
	}

}
