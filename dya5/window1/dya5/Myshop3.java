package dya5;

import java.util.Scanner;

public class Myshop3 {

	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		//1. 두 수를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 숫자를 입력해주세요");
		System.out.print("1번숫자: ");
		int input1 = sc.nextInt();
		
		System.out.println("2번 숫자를 입력해주세요");
		System.out.print("2번숫자: ");
		int input2 = sc.nextInt();

		//2. Cal2 메소드는 미리 정의해줬으니까 ㅇㅋ
		
		//3. Cal2 메소드 정의에 따라 x+y+100에다가 100을 곱한 값을 토해내야 하므로
		int result = cal2.myCal(input1,input2);
		System.out.println("지정된 식에 의한 계산결과는 " + (result * 100));
	}

}
