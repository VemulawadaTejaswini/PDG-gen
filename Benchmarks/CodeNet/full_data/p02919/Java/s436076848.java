import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = in.nextInt();
		System.out.println(solve(n, p));
		in.close();
	}

	private static long solve(int n, int[] p) {
		long r = 0;
		int[] f = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n - 1; i++)
			if (p[i] > p[i + 1]) {
				s[i] = p[i + 1];
				f[i] = p[i];
				r += s[i];
			} else {
				s[i] = p[i];
				f[i] = p[i + 1];
				r += s[i];
			}
		for (int k = 2; k < n; k++)
			for (int i = 0; i < n - k; i++)
				if (f[i] == f[i + 1])
					if (s[i] > s[i + 1]) {
						r += s[i];
					} else {
						s[i] = s[i + 1];
						r += s[i];
					}
				else if (f[i] > f[i + 1])
					if (s[i] > f[i + 1]) {
						r += s[i];
					} else {
						s[i] = f[i + 1];
						r += s[i];
					}
				else if (s[i + 1] > f[i]) {
					f[i] = f[i + 1];
					s[i] = s[i + 1];
					r += s[i];
				} else {
					s[i] = f[i];
					f[i] = f[i + 1];
					r += s[i];
				}
		return r;
	}

}