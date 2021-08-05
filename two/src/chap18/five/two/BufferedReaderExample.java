package chap18.five.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is =System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력: ");
		String lineString = br.readLine();//줄단위로 읽게함
		
		System.out.print("출력: " + lineString);
		
		br.close();
		reader.close();
		is.close();


	}

}
