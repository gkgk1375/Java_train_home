package chap16.two.five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args)  throws IOException {
		Path path = Paths.get("D:\\KYH-DATA\\git_data\\Java_train_one\\one\\src");
		                         // 역슬래시의 경우 \\두개 이렇게 두개 입력해야함
		Stream<Path> stream = Files.list(path);
		stream.forEach(p->System.out.println(p.getFileName()));//폴더명만 가능함
		// p=서브디렉토리또는파일에해당하는Path객체|서브디렉토리이름 또는 파일이름 리턴

	}

}
