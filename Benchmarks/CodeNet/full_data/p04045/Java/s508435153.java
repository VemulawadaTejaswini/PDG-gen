import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] D = nextIntArray(sc, K);

		sc.close();

		Set<Integer> deny = new HashSet<>();
		Set<Integer> allow = new HashSet<>();

		for (int i = 0; i < D.length; i++) {
			deny.add(D[i]);
		}

		int allowMin = Integer.MAX_VALUE;
		for (int i = 0; i <= 9; i++) {
			if (!deny.contains(i)) {
				allow.add(i);
				allowMin = Math.min(allowMin, i);
			}
		}

		int[] q = new int[5];
		boolean[] allowZero = new boolean[5];
		for (int i = 0; i < 5; i++) {
			int a = (int) Math.pow(10, i);
			q[5 - i - 1] = (N / a) % 10;

			if ((N / a) == 0) {
				allowZero[5 - i - 1] = true;
			}
		}

		for (int i = 4; i >= 0; i--) {
			int x;
			for (x = q[i]; x <= 20; x++) {
				if (allow.contains(x%10) || (x == 0 && allowZero[i])) {
					break;
				}
			}
			if (x >= 10) {
				q[i - 1] += (x/10);
				q[i] = (x%10);
			} else {
				q[i] = x;
			}
		}

		int ans = 0;
		for (int i = 0; i < 5; i++) {
			ans *= 10;
			ans += q[i];
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
