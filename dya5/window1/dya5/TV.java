package dya5;

public class TV {
		//정적인 특징(상태) -> 변수  : 네모모양이고 받침대가 있다
		String shape;
		boolean stand;
	
	
	
		//동적인 특징(동작) -> 메소드	: 채널변경되다. TV켜지다.
		public void change(int ch) {
			System.out.println(ch + "번으로 채널을 변경하다.");
			
		}

		public void turnOn() {
			System.out.println("TV를 켜다");
			
		}




}
