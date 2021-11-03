package day6;

public class ArrayMultiDimensionEx2 {

	public static void main(String[] args) {
		/* 구구단 2단에서 9단 전체를 배열에 저장하여 출력하는 코드를 작성하세요.
		 * */
		//0번지를 쓰지 않고 하기 위여 [9][9]를쓰지 않기 위해 / 편하게 보기 위해서 사용
		int [][] multipleTable = new int[10][10]; 
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				multipleTable[i][j] = i*j;
				System.out.println(i + "x" + j + "=" + multipleTable[i][j]);
			}
		}
	}

}
