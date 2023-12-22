import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		if(s.equals("SUN")) {
			System.out.println(7);
			System.exit(0);
		}
		if(s.equals("MON")) {
			System.out.println(6);
			System.exit(0);
		}
		if(s.equals("TUE")) {
			System.out.println(5);
			System.exit(0);
		}
		if(s.equals("WED")) {
			System.out.println(4);
			System.exit(0);
		}
		if(s.equals("THU")) {
			System.out.println(3);
			System.exit(0);
		}
		if(s.equals("FRI")) {
			System.out.println(2);
			System.exit(0);
		}
		if(s.equals("SAT")) {
			System.out.println(1);
			System.exit(0);
		}
		
	}

}
