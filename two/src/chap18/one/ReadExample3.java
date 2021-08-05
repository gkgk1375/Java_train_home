package chap18.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new  FileInputStream("C:/temp/test.txt");
		int readByteNo;
		byte[]readBytes = new byte[8];
		String data=" ";
			readByteNo = is.read(readBytes,2,3);//앞에 공백 2칸을주고 글자 3개를 출력
			for(int i=0; i<readBytes.length;i++) {
			System.out.print((char)readBytes[i]);
		}
		
		is.close();

	}

}
