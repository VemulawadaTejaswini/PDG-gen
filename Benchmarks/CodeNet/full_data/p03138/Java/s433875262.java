import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

class Pair<A, B> {
	public final A car;
	public final B cdr;

	public Pair(A _car, B _cdr) {
		car = _car;
		cdr = _cdr;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Pair))
			return false;
		Pair<?, ?> p = (Pair<?, ?>) o;
		return car.equals(p.car) && cdr.equals(p.cdr);
	}

	public int hashCode() {
		return car.hashCode() ^ cdr.hashCode();
	}
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long f(long x) {
		long result = 0;
		for (long n : a) {
			result += x ^ n;
		}
		return result;
	}

	long f(long x, long mask) {
		long result = 0;
		for (long n : a) {
			result += (x ^ n) & mask;
		}
		return result;
	}

	int N;
	long K;
	long[] a;

	HashMap<Pair<Long, Long>, Long> memo = new HashMap<>();

	// t ここまで最大
	long rec(long x, long mask) {
		if (mask == 0) {
			return f(0, 0);
		}

		Pair<Long, Long> memoKey = new Pair<>(x, mask);
		Long a = memo.get(memoKey);
		if (a != null) {
			return a;
		}

		long ans;

		if ((x & mask) == 0) {
			ans = f(x, mask) + rec(x, mask >> 1);
		} else {
			long a1, a2;

			a1 = f(mask, mask) + rec(x, mask >> 1);
			a2 = f(0, mask) + rec(mask - 1, mask >> 1);

			ans = Math.max(a1, a2);
		}

		memo.put(memoKey, ans);
		return ans;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		K = sc.nextLong();

		a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}

		if (K == 0) {
			out.println(f(0));
		} else {
			long ans = rec(K, Long.highestOneBit(K));
			out.println(ans);
		}
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
