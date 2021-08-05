package chap14.five;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i=0; i<10; i++) {      //람다식 (스레드가 실행하는 코드)
				System.out.println(i);
			}
		};
		
		
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
