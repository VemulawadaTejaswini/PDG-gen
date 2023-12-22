import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N + 1);
		int[] B = nextIntArray(sc, N);

		sc.close();

		long ans = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] >= B[i]) {
				//iの街のモンスターのみ倒す
				ans += B[i];

			} else {
				//iの街のモンスターを倒したあと、余力でi+1の街のモンスターを倒す
				ans += A[i];
				B[i] -= A[i];

				ans += Math.min(A[i + 1], B[i]); //i+1のモンスターの数 と 余力の小さいほうを倒した数に加算
				A[i + 1] = Math.max(A[i + 1] - B[i], 0);

			}
		}

		out.println(ans);

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
