// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final long INF = 1000000000000000001L;
	long count2(int[] xx, int n, int[] yy, int m, long a) {
		long cnt = 0;
		for (int i = 0, j = m - 1; i < n; i++) {
			long z = a / xx[i];
			while (j >= 0 && yy[j] > z)
				j--;
			cnt += j + 1;
		}
		return cnt;
	}
	long count1(int[] xx, int n, long a) {
		long cnt = 0;
		for (int i = 0, j = n - 1; i < j; i++) {
			long z = a / xx[i];
			while (i < j && xx[j] > z)
				j--;
			cnt += j - i;
		}
		return cnt;
	}
	void main() {
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] pp = new int[n];
		int[] qq = new int[n];
		int np = 0, nq = 0, no = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a > 0)
				pp[np++] = a;
			else if (a < 0)
				qq[nq++] = -a;
			else
				no++;
		}
		pp = Arrays.stream(pp, 0, np).boxed().sorted().mapToInt($->$).toArray();
		qq = Arrays.stream(qq, 0, nq).boxed().sorted().mapToInt($->$).toArray();
		System.err.println(Arrays.toString(pp));
		System.err.println(Arrays.toString(qq));
		long mq = (long) np * nq;
		long mo = (long) no * (no - 1) / 2 + (long) no * (np + nq);
		if (k > mq && k <= mq + mo) {
			println(0);
			return;
		}
		boolean positive;
		if (k <= mq) {
			positive = false;
			k = mq + 1 - k;
		} else {
			positive = true;
			k -= mq + mo;
		}
		println(positive);
		println(k);
		long lower = 0, upper = INF;
		while (upper - lower > 1) {
			long a = (lower + upper) / 2;
			long cnt = positive ? count1(pp, np, a) + count1(qq, nq, a)
				: count2(pp, np, qq, nq, a);
			if (cnt >= k)
				upper = a;
			else
				lower = a;
		}
		println(positive ? upper : -upper);
	}
}
