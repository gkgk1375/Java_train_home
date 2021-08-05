package chap18.one;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		byte[] data = "ABCD".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
