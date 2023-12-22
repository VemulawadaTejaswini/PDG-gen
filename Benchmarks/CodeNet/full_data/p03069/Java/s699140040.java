import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static String repeat(String str, int n) {
		return String.join("", Collections.nCopies(n, str));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();

		int diff = 0;
		String rightAnswer = repeat(".", n);
		int nextDiff = 0;

		for (int i = 0; i < n; i++) {
			if (line.charAt(i) != rightAnswer.charAt(i))
				diff++;
		}

		int best = diff;

		for (int i = n - 1; i > -1; i--) {
			if (line.charAt(i) == '#')
				nextDiff = diff - 1;
			else {
				nextDiff = diff + 1;
			}
			if (nextDiff < best) {
				best = nextDiff;
			}
			diff = nextDiff;
		}

		System.out.println(best);

		sc.close();
	}
}