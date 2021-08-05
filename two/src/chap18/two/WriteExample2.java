package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("c:/temp/test.txt");
		char[] data = "홍길".toCharArray();
		
	    writer.write(data);
		writer.flush();
		writer.close();

	}

}
