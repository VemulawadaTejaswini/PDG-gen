import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		in.close();
	}

	private static long solve(int n, long k, int[] a) {
		long ret = 0;
		long c = k * (k - 1) / 2l;
		c %= 1000000007;
		for (int i = 0; i < n; i++) {
			long r1 = 0;
			long r2 = 0;
			for (int j = 0; j < i; j++)
				if (a[i] < a[j])
					r1++;
			for (int j = i + 1; j < n; j++)
				if (a[i] < a[j])
					r2++;
			ret += r1 * k;
			ret += (r1 + r2) * c;
			ret %= 1000000007;
		}
		return ret;
	}
}
