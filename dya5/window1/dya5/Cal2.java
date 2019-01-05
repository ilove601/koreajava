package dya5;
//반환타입을 void가 아닌 다른 것으로 해보는 것이다.

public class Cal2 {

		public int myCal(int x, int y) {return x + y + 100 ;}
	
		public void add(int x, int y) {
		System.out.println("두 수의 합은 " + (x + y));
		}
		public void minus(int x, int y) {
		System.out.println("두 수의 차는 " + (x - y));
		}
		
		public int mul(int x, int y) {return x*y;}
		
		public void div(int x, int y) {
			System.out.println("x 나누기 y는 " + (x / y));
	
		}}
