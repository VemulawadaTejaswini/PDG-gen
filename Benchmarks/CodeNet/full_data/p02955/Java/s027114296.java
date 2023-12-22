import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println(solve(n, k, a));
	}

	private static int solve(int n, int k, int[] a) {
		int t = 0;
		for (int i = 0; i < n; i++)
			t += a[i];
		for (int i = 1;; i++) {
			int r = t / i;
			if (r < 2)
				break;
			if (t % i != 0)
				continue;
			if (isPossible(n, k, a, r))
				return r;
		}
		return 1;
	}

	private static boolean isPossible(int n, int k, int[] a, int r) {
		int[] m = new int[n];
		for (int i = 0; i < n; i++)
			m[i] = a[i] % r;
		Arrays.sort(m);
		int d = 0;
		int u = n - 1;
		int down = m[d];
		int up = r - m[u];
		while (d < u) {
			if (down > k || up > k)
				return false;
			if (down > up) {
				u--;
				up += r - m[u];
			} else {
				d++;
				down += m[d];
			}
		}
		return true;
	}
}
