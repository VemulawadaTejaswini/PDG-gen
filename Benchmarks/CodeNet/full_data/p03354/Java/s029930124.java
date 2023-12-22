import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[] p = new int[n];
		int[] x = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < n; i++)
			p[i] = in.nextInt() - 1;
		for (int i = 0; i < m; i++) {
			x[i] = in.nextInt() - 1;
			y[i] = in.nextInt() - 1;
		}
		System.out.println(solve(p, x, y));
		in.close();
	}

	private static int solve(int[] a, int[] x, int[] y) {
		int[] r = new int[a.length];
		for (int i = 0; i < r.length; i++)
			r[i] = -1;
		for (int i = 0; i < x.length; i++) {
			joinR(x[i], y[i], r);
		}

		int c = 0;
		for (int i = 0; i < a.length; i++)
			if (getR(a[i], r) == getR(i, r))
				c++;
		return c;
	}

	private static void joinR(int i, int j, int[] r) {
		if (getR(i, r) == getR(j, r))
			return;
		r[getR(i, r)] = getR(j, r);
	}

	private static int getR(int i, int[] r) {
		if (r[i] == -1)
			return i;
		r[i] = getR(r[i], r);
		return r[i];
	}
}
