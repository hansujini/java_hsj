package day10;

public class ClassStaticEx1 {

	public static void main(String[] args) {
		//에러 발생. 객체를 생성하지 않고, 클래스를 통해 객체변수를 호출했기 때문에
		//System.out.println("객체 변수 num1 : " + Test1.num1);
		System.out.println("클래스 변수 num1 : " + Test1.num2);
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.num1 = 20;
		t1.num2 = 40;
		System.out.println("t1 객체 변수 num1 : " + t1.num1);
		System.out.println("t1 클래스 변수 num1 " + t1.num2);
		System.out.println("t2 객체 변수 num1 : " + t2.num1);
		System.out.println("t2 클래스 변수 num1 " + t2.num2);
		
		
	}

}
class Test1{
	public int num1 = 1;		//객체 변수
	public static int num2 = 2; //클래스 변수
	
}