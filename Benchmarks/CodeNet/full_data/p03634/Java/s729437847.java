import java.io.*;
import java.util.*;

class Main {


	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N - 1];
		int[] b = new int[N - 1];
		long[] c = new long[N - 1];
		for (int i = 0; i < N - 1; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextLong();
		}

		int Q = sc.nextInt();
		int K = sc.nextInt() - 1;

		long[] dk = new long[N];
		Arrays.fill(dk, Long.MAX_VALUE);
		dk[K] = 0;
		while (true) {
			boolean updated = false;
			for (int i = 0; i < N - 1; i++) {
				if (dk[a[i]] != Long.MAX_VALUE) {
					if (dk[a[i]] + c[i] < dk[b[i]]) {
						dk[b[i]] = dk[a[i]] + c[i];
						updated = true;
					}
				}
				if (dk[b[i]] != Long.MAX_VALUE) {
					if (dk[b[i]] + c[i] < dk[a[i]]) {
						dk[a[i]] = dk[b[i]] + c[i];
						updated = true;
					}
				}
			}
			if (!updated) break;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			sb.append(dk[x] + dk[y]).append("\n");
		}

		System.out.print(sb.toString());
	}
}
