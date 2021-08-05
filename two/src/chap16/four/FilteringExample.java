package chap16.four;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String>names = Arrays.asList("홍길동","신용권","감자바","신용권","신민철");
		
		names.stream()
		.distinct()//중복제거
		.forEach(n->System.out.println(n)); //전체조회
		System.out.println();
		
		names.stream()
		.filter(n->n.startsWith("신")) //신씨만나오게 필터링
		.forEach(n->System.out.println(n)); //전체조회
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n->n.startsWith("신"))//중복 제거후 필터링
		.forEach(n->System.out.println(n)); //전체조회
		
	}

}
