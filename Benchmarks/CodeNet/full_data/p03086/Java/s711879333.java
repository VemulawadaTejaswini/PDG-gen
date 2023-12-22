
import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		String b = sc.next();
		String[] ary = b.split("");
		int answer = 0;
		String ACGT = "ACGT";
		int x = 0;
		for (String str : ary) {
			if (ACGT.indexOf(str) >= 0) {
				x++;
			} else {
				if (answer < x) {
					answer = x;
				}
				x = 0;
			}
		}

		answer = Math.max(answer, x);

		System.out.println(answer);

	}

}
