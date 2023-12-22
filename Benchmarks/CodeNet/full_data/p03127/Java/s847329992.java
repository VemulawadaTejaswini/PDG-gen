import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Long answer = null;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if (answer == null) {
				answer = a;
				continue;
			}
			answer = gcd(answer, a);
		}
		System.out.println(answer);
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}
