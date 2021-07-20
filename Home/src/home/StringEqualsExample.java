package home;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVal1 = "신민철";//내용이 같고 변수명이 다르면
		String strVal2 = "신민철";//그 주소는 모두 동일함
		if(strVal1 == strVal2) {
			System.out.println("strVal1 과 strVal2 는 참조가 같음");
		}else {
			System.out.println("strVal1 과 strVal2 는 참조가 다름");
		}
		
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1 과 strVal2 는 문자열이 같음");
		}
		
		String strVal3 = new String("신민철");//new를 입력하므로써 새로운 동적인 메모리공간이생김
		String strVal4 = new String("신민철");//서로 다른 각각의 메모리를 만듦
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3 과 strVal4 는 참조가 같음");
		}else {
			System.out.println("strVal3 과 strVal4 는 참조가 다름");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3 과 strVal4 는 문자열이 같음");
		}		

	}

}
