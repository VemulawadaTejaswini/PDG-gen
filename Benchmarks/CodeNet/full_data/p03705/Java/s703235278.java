import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		sc.close();

		if (A > B) {
			out.println(0);
			return;
		}

		if (N == 1 && A != B) {
			out.println(0);
			return;
		} else if (N == 1 && A == B) {
			out.println(1);
			return;
		}

		long max = Math.max(A, B) * (N - 1) + Math.min(A, B);
		long min = Math.min(A, B) * (N - 1) + Math.max(A, B);

		out.println(max - min + 1);

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

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
