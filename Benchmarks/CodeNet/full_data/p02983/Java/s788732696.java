import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int M = 2019;
		long l = sc.nextLong();
		long r = sc.nextLong();
		long lm = l % M;
		long rm = r % M;

		if (lm >= rm || r - l >= M - 1) {
			System.out.println(0);
			return;
		}

		System.out.println((lm * (lm + 1)) % M);
	}
}
