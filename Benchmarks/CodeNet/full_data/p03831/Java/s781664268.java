import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();

		long[] X = new long[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextLong();
		}

		sc.close();

		long ans = 0;
		for (int i = 1; i < N; i++) {
			ans += Math.min(A * (X[i] - X[i - 1]), B);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
