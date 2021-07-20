package home;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
			
		int[] scores = { 80, 90, 87};
		
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("종합:" + sum);
		
		double avg = (double) sum /scores.length;
		
		Double value = 85.66666666666667;
		DecimalFormat form = new DecimalFormat("#.##");
		System.out.println("평균:" + form.format(value));

	}

}
