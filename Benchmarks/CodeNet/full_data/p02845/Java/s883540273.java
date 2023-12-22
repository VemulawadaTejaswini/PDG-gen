import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int mod = 1000000007;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] A = nextIntArray(sc, N);

		sc.close();

		long ans = 3;
		int[] x = new int[] { 1, 0, 0 };

		for (int i = 1; i < N; i++) {
			int z = 0;
			boolean b = false;
			if (x[0] == A[i]) {
				z++;
				x[0]++;
				b = true;
			}
			if (x[1] == A[i]) {
				z++;
				if (!b) {
					x[1]++;
					b = true;
				}
			}
			if (x[2] == A[i]) {
				z++;
				if (!b) {
					x[2]++;
					b = true;
				}
			}
			ans *= z;
			ans %= mod;
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
