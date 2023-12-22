import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String week = sc.next();

		if(week.equals("SUN")) {
			System.out.println(7);
		}
		if(week.equals("MON")) {
			System.out.println(6);
		}
		if(week.equals("TUE")) {
			System.out.println(5);
		}
		if(week.equals("WED")) {
			System.out.println(4);
		}
		if(week.equals("THU")) {
			System.out.println(3);
		}
		if(week.equals("FRI")) {
			System.out.println(2);
		}
		if(week.equals("SAT")) {
			System.out.println(1);
		}
	}
}