package day7;

public class MethodPrimeNumEx1 {

	public static void main(String[] args) {
		/* 주어진 정수가 소수인지 아닌지 판별하는 메소드를 만들고 호출하여 확인하세요.*/
		/* 기능 : 고속버스 티켓을 예매
		 * 필요한것 : 출발지, 도착지, 시간, 좌석번호
		 * 결과 : 예매 내역
		 * 
		 * */
		int num = 2;
		if(isPrime(num)) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아님");
		}

	}
	/* 기능 : 주어진 정수가 소수이면 참을 아니면 거짓임을 알려주는 메소드
	 * 매개변수 : 주어진 수  => int num
	 * 리턴타입 : 참/ 거짓 => boolean
	 * 매소드명 : isPrime
	 * public static 리턴타입 메소드명 (메개변수){
	 * }
	 * */
		public static boolean isPrime (int num) {
			int count = 0;
			if(num<=0) {
				return false;
		}
			for (int i = 1; i <=num; i++) {
				if(num % i == 0) {
					count++;
			}
		}
			if(count ==2) {
			return false;
		}
			// 아래 return은 else
			return false;
		}
}
