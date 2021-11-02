package day5;

public class StarEx4 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 코드를 작성하세요.
		 * 방법1
		 * 짝수표현 2n(n=1,2,3,...)
		 * 홀수표현 2n-1(n=1,2,3,...)
		 *     *		i=1 공백=4 *=1 앤터
		 *    ***		i=2 공백=3 *=3 앤터
		 *   *****		i=3 공백=2 *=5 앤터
		 *  *******		i=4 공백=1 *=7 앤터
		 * ********* 	i=5 공백=0 *=9 앤터
		 * 					공백=5-i *=2*i-1
		
		 * 방법2
		 *     *		i=1 공백=4 *=1 *=0앤터
		 *    ** *		i=2 공백=3 *=2 *=1앤터
		 *   *** **		i=3 공백=2 *=3 *=2앤터
		 *  **** ***	i=4 공백=1 *=4 *=3앤터
		 * ***** **** 	i=5 공백=0 *=5 *=4앤터
		 * 					공백=5-i *=i *=i-1
		 * */
		//방법2. StarEx3의 예제를 활용
		int num = 5, i, j;
		for(i=1; i<=num; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//방법1.
		i = 1;
		while(i<=num) {
			j=1;
			while(j<=num-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
