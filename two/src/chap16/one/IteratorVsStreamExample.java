package chap16.one;

import java.util.*;
import java.util.stream.Stream;


public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) { //while문을 통해서 반복을 해야함
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		//Stream 이용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));//forEach문을 이용하여 반복|람다식사용

	}

}
