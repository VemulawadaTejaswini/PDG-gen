import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M1 = sc.nextInt();
		int D1 = sc.nextInt();
		int M2 = sc.nextInt();
		int D2 = sc.nextInt();
		int answer = 0;

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, M1 - 1);
		if (cal.getActualMaximum(Calendar.DATE) == D1) answer++;

		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, M2 - 1);
		if (cal.getActualMaximum(Calendar.DATE) == D2) answer++;

		System.out.println(answer);
	}
}
