package day6;

public class ArratLengthEx1 {

	public static void main(String[] args) {
		//배열의 길이를 arr.length 가지고 알아볼 수 있다.
		int [] arr =new int [5];
		System.out.println("배열의 길이 : " + arr.length);
		
		//arr.lengt를 활용할 때 자주 사용하는 것 for(i=0;i<arr.length;i++)
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]= " + arr[i]);
		}
	}

}
