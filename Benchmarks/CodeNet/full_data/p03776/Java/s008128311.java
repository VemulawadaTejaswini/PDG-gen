import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long[] v = new long[N];
		for (int i = 0; i < N; ++i) {
			v[i] = sc.nextLong();
		}

		Arrays.sort(v);
		HashMap<Long, Integer> cnt = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!cnt.containsKey(v[i])) {
				cnt.put(v[i], 1);
			} else {
				cnt.put(v[i], cnt.get(v[i]) + 1);
			}
		}

		long[] sum = new long[N];

		double maxAve = 0;
		for (int i = N - 1; i >= 0; --i) {
			sum[i] = v[i] + (i + 1 < N ? sum[i + 1] : 0);
			if (N - i >= A && N - i <= B) {
				if (maxAve < 1d * sum[i] / (N - i)) {
					maxAve = 1d * sum[i] / (N - i);
				}
			}
		}
		System.out.printf("%.20f\n", maxAve);
		HashMap<Long, Integer> cnt2 = new HashMap<>();
		long comb = 0;
		for (int i = N - 1; i >= 0; --i) {
			if (!cnt2.containsKey(v[i])) {
				cnt2.put(v[i], 1);
			} else {
				cnt2.put(v[i], cnt2.get(v[i]) + 1);
			}
			if (N - i >= A && N - i <= B)
				if (Math.abs(maxAve - 1d * sum[i] / (N - i)) < 1e-6) {
					int all = cnt.get(v[i]);
					int cur = cnt2.get(v[i]);
					BigInteger d = new BigInteger("1");
					cur = Math.min(cur, all - cur);
					for (long j = all; j > all - cur; --j) {
						d = d.multiply(BigInteger.valueOf(j));
					}
					for (long j = 1; j <= cur; ++j) {
						d = d.divide(BigInteger.valueOf(j));
					}
					comb += d.longValue();
				}
		}
		System.out.println(comb);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}