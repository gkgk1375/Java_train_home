package chap06_1;

public class Calculator {
	
//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	float divide(int x, int y) {
		float result = (float)x / (float)y;//double 을 두개써도 차이가없음
		return result;
	}
	
	void powerrOff() {
		System.out.println("전원을 끕니다.");
	}

}
