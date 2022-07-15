package j03_연산자;

public class Operation {  // 단축기 : sysout 하고 컨트롤 + 스페이스바
						// 컨트롤 + 알트 + 방향키 밑 = 복사
	public static void main(String[] args) {
		int num = 50;
		
		System.out.println(++num); //선증가
		System.out.println(num);
		System.out.println(num++); //후증가
		System.out.println(num);
		
		System.out.println(--num); //선감소
		System.out.println(num);
		System.out.println(num--); //후감소
		System.out.println(num);
		
	}

}
