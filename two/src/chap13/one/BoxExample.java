package chap13.one;

import chap13.four.Box;

public class BoxExample {
	public static void main(String[]args) {
		Box box = new Box();
		box.set("홍길동"); //자동타입변환
		String name = (String) box.get();//강제타입변환
		
		box.set(new Apple());//자동타입변환
		Apple apple = (Apple) box.get();//강제타입변환
	}

}

