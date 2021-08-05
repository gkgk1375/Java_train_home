package chap18.test;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		int k[] = {3,7,2,7,9,10,11};
		Arrays.sort(k);
		
		for(int i : k) {
			System.out.print("["+i+"]");
		}
		
	}
}
		