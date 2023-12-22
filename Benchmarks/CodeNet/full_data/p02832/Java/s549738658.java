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
		int[] a = nextIntArray1origin(sc, N);

		sc.close();

		int k = 1;
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			if (a[i] != k) {
				ans++;
			} else {
				k++;
			}

		}

		if (ans == N) {
			out.println(-1);
		} else {
			out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
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
