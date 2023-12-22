import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final long A = scn.nextLong();
			final long B = scn.nextLong();
			final long K = scn.nextLong();

			System.out.printf("%d %d%n", Math.max(A - K, 0), Math.max(0, Math.min(B, B - (K - A))));
		}
	}
}
