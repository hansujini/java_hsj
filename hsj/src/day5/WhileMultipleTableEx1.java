package day5;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* while문을 이용하여 구구단 7단을 출력하는 코드를 작성하세요.
		 * 반복횟수	: i 가 1부터 9까지 1씩 증가 
		 * 규칙성		: 7 x i = 7*i를 출력
		 * */
		// 연습할때는 기본에 충실하게 하고, 잘하게 되면 깔끔하게 하는 방법을 함!
			int i = 1, num = 7;
			while(i <= 9) {
				System.out.println(num + " X " + i + " = " + (num*i));
				i++;
		}
			i = 1;
			num = 6;
			while(i <= 9 ) {
				System.out.println(num + " X " + i + " = " + (num*i++));
		}
	}
}
