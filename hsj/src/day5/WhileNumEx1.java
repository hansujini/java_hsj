package day5;

public class WhileNumEx1 {

	public static void main(String[] args) {
		/* 1부터 5까지 출력하는 코드는 while문으로 작성하세요.
		 * */
		int i;
		i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			 i++;
			 
			 System.out.println("--------");
			 //강사님의 스타일로 while문을 사용했을때  //오류 ㅠㅠ 수정하기
			 i = 5;
			 while(i-- > 0) {
				 System.out.println("Hello");
			 }
		}
	}

}
