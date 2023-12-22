
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] p = new long[n];
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextLong();
			}
			int result = 0;

			for (int i = 1; i < n - 1; i++) {
				if (judge(p[i - 1], p[i], p[i + 1])) {
					result++;
				}
			}

			System.out.println(result);
		}

	}

	private static boolean judge(long a, long b, long c) {
		return (a < b && b < c) || (c < b && b < a);
	}
}
