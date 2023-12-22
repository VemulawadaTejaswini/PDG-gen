
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		long[] one = new long[62];
		for (int i = 0; i < N; ++i) {
			for (int shift = 0; shift < 62; ++shift) {
				if ((A[i] >> shift) % 2 == 1) {
					++one[shift];
				}
			}
		}
		long MOD = (long) (1e9 + 7);
		long ans = 0;
		for (int shift = 0; shift < one.length; shift++) {
			ans += (1L << shift) % MOD * one[shift] % MOD * (N - one[shift]) % MOD;
			ans %= MOD;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
