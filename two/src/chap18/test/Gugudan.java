package chap18.test;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		for (int dan = 2; dan < 10; dan++ ) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %2d\t", dan,j,dan*j);
				System.out.println();
			}
			System.out.println("===========");
		}
	}
}