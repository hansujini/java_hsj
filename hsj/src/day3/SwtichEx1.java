package day3;

import java.util.Scanner;

public class SwtichEx1 {

	public static void main(String[] args) {
		/* switch문을 이용하여 정수의 홀짝 여부를 판별하는 코드를 작성하세요.
		 * switch문은 조건문이 아닌 식 또는 변수의 값.
		 * break를 주석처리하면 다음으로 넘어가서 처리가 됨.
		 * */
		
		int num = 13;
		switch(num % 2) {
		case 0:
			System.out.println(num + "는 짝수");
		break;
		default:
		    System.out.println(num + "는 홀수");
		}
	}

}
