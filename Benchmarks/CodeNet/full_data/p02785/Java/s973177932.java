import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long K = sc.nextLong();
		long[] H = nextLongArray(sc, (int) N);

		sc.close();

		Arrays.sort(H);

		long sum = 0;
		for (int i = 0; i < Math.max(N - K, 0); i++) {
			sum += H[i];
		}

		out.println(sum);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}
}
