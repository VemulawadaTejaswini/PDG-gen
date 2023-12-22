import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();

		long[] s = new long[a + 2];
		long[] t = new long[b + 2];
		long[] x = new long[q];

		for (int i = 1; i < a + 1; i++) {
			s[i] = sc.nextLong();
		}
		s[0] = -10000000000000000L;
		s[a + 1] = 10000000000000000L;

		for (int i = 1; i < b + 1; i++) {
			t[i] = sc.nextLong();
		}
		t[0] = -10000000000000000L;
		t[b + 1] = 10000000000000000L;


		for (int i = 0; i < q; i++) {
			x[i] = sc.nextLong();
		}

		for (int i = 0; i < x.length; i++) {
			int lt = binarySearch(t, x[i]);
			long answer = 1000000000000000000L;


			if (lt != 0) {
				int lls = binarySearch(s, t[lt]);
				long dl = Math.abs(x[i] - t[lt]);
				answer = Math.min(answer, dl + Math.abs(t[lt] - s[lls]));
				answer = Math.min(answer, dl + Math.abs(t[lt] - s[lls + 1]));
			}

			if (lt + 1 != b + 1) {
				int rt = lt + 1;
				long dr = Math.abs(x[i] - t[rt]);
				int rls = binarySearch(s, t[rt]);
				answer = Math.min(answer, dr + Math.abs(t[rt] - s[rls]));
				answer = Math.min(answer, dr + Math.abs(t[rt] - s[rls + 1]));
			}


			lt = binarySearch(s, x[i]);

			if (lt != 0) {
				int lls = binarySearch(t, s[lt]);
				long dl = Math.abs(x[i] - s[lt]);
				answer = Math.min(answer, dl + Math.abs(s[lt] - t[lls]));
				answer = Math.min(answer, dl + Math.abs(s[lt] - t[lls + 1]));
			}

			if (lt + 1 != a + 1) {
				int rt = lt + 1;
				long dr = Math.abs(x[i] - s[rt]);
				int rls = binarySearch(t, s[rt]);

				answer = Math.min(answer, dr + Math.abs(s[rt] - t[rls]));
				answer = Math.min(answer, dr + Math.abs(s[rt] - t[rls + 1]));
			}


			System.out.println(answer);
		}
	}

	private static int binarySearch(long[] a, long x) {
		int l = 0;
		int r = a.length;
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a[m] <= x) {
				l = m;
			} else {
				r = m;
			}
		}
		return l;
	}
}
