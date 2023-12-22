import java.io.*;
import java.util.*;

class Main {

	static final int M = 1000000007;

	private static Map<Long, Long> factorize(long n) {
		Map<Long, Long> a = new HashMap<>();
		for (long i = 2; i * i <= n; i++) {
			if (n % i != 0) continue;
			long count = 0;
			while (n % i == 0) {
				count++;
				n /= i;
			}
			a.putIfAbsent(i, count);
		}

		if (n != 1) a.putIfAbsent(n, 1L);
		return a;
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Long, Long> lcm = new HashMap<>();
		Map<Long, Long>[] m = new HashMap[N];
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			m[i] = factorize(A[i]);
			for (Map.Entry<Long, Long> e : m[i].entrySet()) {
				lcm.putIfAbsent(e.getKey(), e.getValue());
				if (lcm.get(e.getKey()) < e.getValue()) {
					lcm.put(e.getKey(), e.getValue());
				}
			}
		}

		long answer = 0;
		for (int i = 0; i < N; i++) {
			long t = 1;
			for (Map.Entry<Long, Long> e : lcm.entrySet()) {
				if (!m[i].containsKey(e.getKey())) {
					t *= Math.pow(e.getKey(), e.getValue());
					t %= M;
					continue;
				}
				if (m[i].get(e.getKey()).equals(e.getValue())) {
					continue;
				}
				t *= Math.pow(e.getKey(), e.getValue() - m[i].get(e.getKey()));
				t %= M;
			}
			answer = (answer + t) % M;
		}

		System.out.println(answer);
	}
}
