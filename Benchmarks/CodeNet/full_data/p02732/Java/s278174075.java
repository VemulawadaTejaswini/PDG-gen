import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++)
			c[a[i]]++;
		long r = 0;
		for (int i = 0; i <= n; i++)
			if (c[i] > 1)
				r += (long) c[i] * ((long) c[i] - 1) / 2;
		for (int i = 0; i < n; i++) {
			long ans = solve(n, a[i], c, r);
			System.out.println(ans);
		}
	}

	private static long solve(int n, int a, int[] c, long r) {
		if (c[a] > 1)
			return r - c[a] + 1;
		else
			return r;
	}
}