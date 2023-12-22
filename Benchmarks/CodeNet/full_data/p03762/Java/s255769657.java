import java.util.Scanner;

public class Main {
	private static long M = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] xs = new long[n];
		long[] ys = new long[m];

		for (int i = 0; i < n; i++) {
			xs[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			ys[i] = sc.nextInt();
		}

		long xa = 0;
		for (int i = 0; i < n; i++) {
			xa += (i + 1) * xs[i] - (n - i) * xs[i];
			xa %= M;
		}

		long ya = 0;
		for (int i = 0; i < m; i++) {
			ya += (i + 1) * ys[i] - (n - i) * ys[i];
			ya %= M;
		}

		System.out.println((xa * ya) % M);
	}
}
