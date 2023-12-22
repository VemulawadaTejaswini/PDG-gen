import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		int[] b = new int[200000];
		for (int a : A) {
			b[a]++;
		}

		long[] c = new long[200000];
		long sum = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 2) {
				c[i] = (b[i] * (b[i] - 1)) / 2;
				sum += c[i];
			}
		}

		for (int i = 0; i < A.length; i++) {
			long ans = sum;

			ans -= c[A[i]];

			long n = b[A[i]] - 1;
			if (n > 0) {
				ans += (n * (n - 1)) / 2;
			}

			out.println(ans);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
