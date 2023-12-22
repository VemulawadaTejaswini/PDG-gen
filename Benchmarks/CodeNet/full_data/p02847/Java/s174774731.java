import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		String S = scanner.next();
 		int day = 0;
 		if (S.equals("SAT")) {
 			day = 1;
 		} else if (S.equals("FRI")) {
 			day = 2;
 		} else if (S.equals("THU")) {
 			day = 3;
 		} else if (S.equals("WED")) {
 			day = 4;
 		} else if (S.equals("TUE")) {
 			day = 5;
 		} else if (S.equals("MON")) {
 			day = 6;
 		} else if (S.equals("SUN")) {
 			day = 7;
 		}
 		System.out.println(day);
	}
}
