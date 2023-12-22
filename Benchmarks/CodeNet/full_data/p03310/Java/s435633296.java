import java.util.*;
import java.io.*;

class Main {
	public static void main(String... args) {
		int N = IN.nextInt();
		long[] A = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = IN.nextLong() + A[i - 1];
		}

		int iP = 1;
		int iR = 3;
		long ans = calc(1, 2, 3, A);
		for (int iQ = 2; iQ <= N - 2; iQ++) {
			while (canMoveNext(1, iQ, iP, A)) {
				iP += 1;
			}
			while (canMoveNext(iQ + 1, N, iR, A)) {
				iR += 1;
			}
			long tmp = calc(iP, iQ, iR, A);
			if (tmp < ans) {
				ans = tmp;
			}
		}
		puts(ans);
		flush();
	}

	static long calc(int iP, int iQ, int iR, long[] A) {
		long[] ss = {A[iP], A[iQ] - A[iP], A[iR] - A[iQ], A[A.length - 1] - A[iR]};
		long max = 0;
		long min = Long.MAX_VALUE;
		for (long x: ss) {
			if (max < x) max = x;
			if (x < min) min = x;
		}
		return max - min;
	}

	static boolean canMoveNext(int s, int f, int i, long[] A) {
		if (i + 1 == f) {
			return false;
		} else {
			return (Math.abs(2 * A[i + 1] - A[f] - A[s - 1]) <
					Math.abs(2 * A[i] - A[f] - A[s - 1]));
		}
	}

	static final Scanner IN = new Scanner(System.in);
	static final PrintWriter OUT = new PrintWriter(System.out);
	static <T> void puts(T arg) { OUT.println(arg); }
	static void flush() { OUT.flush(); }
}
