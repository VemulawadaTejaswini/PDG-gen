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
		long[] A = new long[N + 1];
		long[] B = new long[N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}

		sc.close();

		long ans = 0;

		for (int i = N; i >= 1; i--) {
			A[i] += ans;

			long c = (B[i] - (A[i] % B[i])) % B[i];
			ans += c;
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
