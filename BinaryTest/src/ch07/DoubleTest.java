package ch07;

public class DoubleTest {
	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		double dNum1 = 0.1;
		
		for(int i = 0; i < 10000; i++) { // 부동 소수점의 오류
			dNum1 = dNum1 + 0.1;
			
		}
		System.out.println(dNum1); // 결과값 1000.1000000001588 나옴 
	}
}
