package dya5;

public class Myroom {

	public static void main(String[] args) {
		//Dog 에서 정의내린 부품을 복사해온다. 단 필요한 부품만 가져와도 됨.
		Dog dog = new Dog();
		dog.leg = 4;
		dog.tail = true;
		
		//동적인 것은 언급만 해주면 된다.
		dog.bark();
		dog.shake();
		
		System.out.println(dog.leg);
		System.out.println(dog.tail);
		
		System.out.println("-------------------");
		
		TV tv1 = new TV();
		tv1.shape = "네모";
		tv1.stand = true;
		
		tv1.turnOn();
		tv1.change(10);
		
		
		TV tv2 = new TV();
		tv2.shape = "다이아몬드";
		tv2.stand = false;
		
		tv2.turnOn();
		tv2.change(11);
		
		
		
		System.out.println("------------------");
		System.out.println(tv1);
		System.out.println(tv2);
	}

}
