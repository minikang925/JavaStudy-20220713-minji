package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER;
		final int MIN_NUMB = 0;
		
		MAX_NUMBER = 100;
		
		int number = 10;		// 문자-정수-실수
		number = 80;			//  낮        높
	
		System.out.println("최소값:" + MIN_NUMB);
		System.out.println("최대값:" + MAX_NUMBER);
		System.out.println("현재값:" + number);
	}

}
