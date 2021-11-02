package day5;

import java.util.Scanner;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		/* 2부터 100이하의 모든 소수를 출력하는 예제
		 * 소수 판별 예제 참고.
		 * 반복횟수 : 2부터 100이하까지 1씩증가
		 * 규칙성  : 모든 소수를 출력
		 * */
		 
	     int num = 2;//숫자가 2부터 시작합니다.
		 int i = 1, count = 0; 
	     
		 while(num <= 100) { //2는 100보다 작거나 같쥬? 참입니다
			 //약수는 1부터 num까지 확인
			 i=1;
			 count = 0; //카운트를 0으로 초기화해줍니다
			  while(i<=num){
			    if(num % i == 0) { //2모드 1은 ????
			    	count++;
	 	}
			    i++;
		}
		 if(count == 2) {
			System.out.print(num + " ");
		}
		num++;
		}
	}
}
