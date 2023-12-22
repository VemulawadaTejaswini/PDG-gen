import java.io.*;
import java.util.Scanner;

class Main {
	private static int[] mulPerm(int[] a, int[] b, int len) {
		int[] c = new int[len + 1];

		for (int i = 1; i <= len; ++i) {
			c[i] = b[a[i]];
		}
		return c;
	}

	private static int[] powPerm(int[] a, int len, int k) {
		int[] p = new int[len + 1];
		for (int i = 1; i <= len; ++i) {
			p[i] = i;
		}

		while (k > 0) {
			if (k % 2 == 1) {
				p = mulPerm(p, a, len);
			}
			a = mulPerm(a, a, len);
			k /= 2;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] a = new int[n + 1];
		int[] d = new int[n];

		for (int i = 1; i <= n; ++i) {
			a[i] = in.nextInt();
			if (i > 1) {
				d[i - 1] = a[i] - a[i - 1];
			}
		}

		int m = in.nextInt();
		int k = in.nextInt();

		int[] p = new int[n];
		
		for (int i = 1; i <= n - 1; ++i) {
			p[i] = i;
		}

		for (int i = 1; i <= m; ++i) {
			int index = in.nextInt();

			int tmp = p[index];
			p[index] = p[index - 1];
			p[index - 1] = tmp;
		}

		int[] q = powPerm(p, n - 1, k);

		int cur = a[1];
		for (int i = 1; i <= n - 1; ++i) {
			System.out.println(cur);
			cur += d[q[i]];
		}
		System.out.println(cur);
	}
}
