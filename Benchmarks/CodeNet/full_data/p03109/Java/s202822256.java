import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		Calendar cal = Calendar.getInstance();
		cal.set(Integer.valueOf(S.split("/")[0]), Integer.valueOf(S.split("/")[1]), Integer.valueOf(S.split("/")[2]));

		Calendar cal2 = Calendar.getInstance();
		cal2.set(2019, 4, 30);
		if (cal.compareTo(cal2) < 0) {
			System.out.println("Heisei");
		} else {
			System.out.println("TBD");
		}
	}
}
