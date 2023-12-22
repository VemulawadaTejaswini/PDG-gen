
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	public static void ComInit() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Collections.sort(list);
		ComInit();
		long ans = 0;
		if(k == 1) {
			System.out.println(0);
		} else {
			for(int l = 0; l < n - 1; l++) {
				for(int r = n - 1; r > 0; r--) {
					if(r - l - 1 < k - 2)
						break;
					ans += (list.get(r) - list.get(l)) * Com(r - l - 1, k - 2);
					ans %= MOD;
				}
			}
			System.out.println(ans);
		}

	}

}
