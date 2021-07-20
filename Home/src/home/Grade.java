package home;

public class Grade {

	public static void main(String[] args) {
		//80이상이면 B 90이상이면 A 70이상이면 C 60 D 50E 40F
		int one = 100;
		int two = 100;
		int three = 100;
		
		switch((one + two + three)/3) {
		case 100 : System.out.println("A");
		break;
		case 90 : System.out.println("B");
		break;
		case 80 : System.out.println("C");
		break;
		case 70 : System.out.println("D");
		break;
		case 60 : System.out.println("E");
		break;
		case 50 : System.out.println("F");
		break;
		default: System.out.println("확인할 수 없습니다");
		}
		

	}

}
