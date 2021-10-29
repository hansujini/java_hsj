package day3;

import java.util.Scanner;

public class SwitchMonthEx1 {

	public static void main(String[] args) {
		/* 월의 마지막일을 출력하는 코드를 switch문으로 작성하세요.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		/*
		 * 콤마를 사용하여 여러개를 입력하거나 case를 입력한다
		 * 여러개를 입력하면 마지막 case의 실행문*/
		
		Scanner scan = new Scanner(System.in);
	     System.out.print("월을 입력하세요(1~12)");
	     int month = scan.nextInt();
	     
	     switch(month) {
	     case 1,3, 5, 7, 8, 10, 12 :
	    	 System.out.println("월은 31일까지 있습니다.");
	     break;
	     case 4: case 6: case 9: case 11:
	    	 System.out.println("월은 30일까지 있습니다.");
	     break;
	     case 2:
	    	 System.out.println("월은 28일까지 있습니다.");
	     break;
	     default:
	    	 System.out.println("잘못입력하셨습니다.");
	     }
	     
	     

	}

}
