package dya5;

import java.util.Scanner;

public class MyShop2 {
//20000원 구매금액 넘어가면 3000원 할인해준다.
	public static void main(String[] args) {
		int price = 5000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 인원을 입력해 주세요");
		System.out.print("주문인원: ");
		
		int input = sc.nextInt();
		Cal2 cal2 = new Cal2();
		
		int sum = cal2.mul(input, price);
		
		if (sum >= 20000) {
			System.out.println("내실금액은 " + (sum-3000)+"원");
		} else {
			System.out.println("내실금액은 " + (sum) + "원");		}
	}

}
