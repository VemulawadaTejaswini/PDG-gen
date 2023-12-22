import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int K = sc.nextInt();
		long[] a = new long[x];
		long[] b = new long[y];
		long[] c = new long[z];
		for (int i = 0; i < x; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < y; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < z; i++) {
			c[i] = sc.nextLong();
		}
		sc.close();

		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);

		long[] dsa = new long[x];
		for (int i = 0; i < x - 1; i++) {
			dsa[i + 1] = a[x - i - 1] - a[x - i - 2] + dsa[i];
		}
		long[] dsb = new long[y];
		for (int i = 0; i < y - 1; i++) {
			dsb[i + 1] = b[y - i - 1] - b[y - i - 2] + dsb[i];
		}
		long[] dsc = new long[z];
		for (int i = 0; i < z - 1; i++) {
			dsc[i + 1] = c[z - i - 1] - c[z - i - 2] + dsc[i];
		}

		int cnta = 1;
		int cntb = 1;
		int cntc = 1;
		while (cnta * cntb * cntc < K) {
			long da = Long.MAX_VALUE;
			if (cnta < x) da = dsa[cnta];
			long db = Long.MAX_VALUE;
			if (cntb < y) db = dsb[cntb];
			long dc = Long.MAX_VALUE;
			if (cntc < z) dc = dsc[cntc];

			if (da > db) {
				if (db > dc) {
					cntc++;
				} else {
					cntb++;
				}
			} else {
				if (da > dc) {
					cntc++;
				} else {
					cnta++;
				}
			}
		}
		if (cnta < x) cnta++;
		if (cnta < x) cnta++;
		if (cnta < x) cnta++;
		if (cnta < x) cnta++;
		if (cntb < y) cntb++;
		if (cntb < y) cntb++;
		if (cntb < y) cntb++;
		if (cntb < y) cntb++;
		if (cntc < z) cntc++;
		if (cntc < z) cntc++;
		if (cntc < z) cntc++;
		if (cntc < z) cntc++;

		long[] ans = new long[cnta * cntb * cntc];
		int cnt = 0;
		for (int i = 0; i < cnta; i++) {
			for (int j = 0; j < cntb; j++) {
				for (int k = 0; k < cntc; k++) {
					ans[cnt] = a[x - i - 1] + b[y - j - 1] + c[z - k - 1];
					cnt++;
				}
			}
		}

		Arrays.parallelSort(ans);
		for (int i = ans.length - 1; i >= ans.length - K; i--) {
			System.out.println(ans[i]);
		}

	}
}
