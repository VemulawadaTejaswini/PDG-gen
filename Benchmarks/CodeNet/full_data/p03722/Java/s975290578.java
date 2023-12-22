import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		long[] c = new long[N];
		long[] cost = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextLong();
		}
		qsort(a, b, c, 0, N - 1);
		for (int i = 0; i < N; i++) {
			cost[b[i] - 1] = Math.max(cost[b[i] - 1], cost[a[i] - 1] + c[i]);
		}

		System.out.println(String.valueOf(cost[N - 1]));
	}

	static void qsort(int[] a, int[] b, long[] c, int left, int right) {
		if (left >= right) {
			return;
		}
		int p = a[(left + right) / 2];
		int l = left;
		int r = right;
		int tmp;
		long tmpc;
		while(l <= r) {
		while(a[l] < p) { l++; }
		while(a[r] > p) { r--; }
			if (l <= r) {
				tmp = a[l];
				a[l] = a[r];
				a[r] = tmp;
				tmp = b[l];
				b[l] = b[r];
				b[r] = tmp;
				tmpc = c[l];
				c[l] = c[r];
				c[r] = tmpc;
				l++;
				r--;
			}
		}
		qsort(a, b, c, left, r);
		qsort(a, b, c, l, right);
	}

	static class Scanner {
		private InputStream in;
		private final byte[] buf = new byte[1024];
		private int cur = 0;
		private int len = 0;

		Scanner (InputStream in) {
			this.in = in;
		}

		private int read() {
			if (cur >= len) {
				cur = 0;
				try {
					len = in.read(buf);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (len < 0) {
					return -1;
				}
			}
			return (int)buf[cur++];
		}

		public String next() {
			int c = read();
			if (c == -1) {
				throw new NoSuchElementException();
			}
			while (c < 33 || 126 < c) {
				c = read();
			}
			StringBuilder sb = new StringBuilder();
			while (33 <= c && c <= 126) {
				sb.appendCodePoint(c);
				c = read();
			}
			return sb.toString();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
