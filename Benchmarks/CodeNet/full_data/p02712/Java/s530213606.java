import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final long N = scn.nextLong();

			long sum = 0;
			for (long l = 1; l <= N; l++) {
				if (l % 3 != 0 && l % 5 != 0) {
					sum += l;
				}
			}
			System.out.println(sum);
		}
	}
}
