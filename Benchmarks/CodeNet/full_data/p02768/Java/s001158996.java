
import java.util.Scanner;

public class Main {

	public static long mod = (long) (Math.pow(10, 9) + 7);

	public static int MAX = 510000;
	public static int MOD = 1000000007;
	public static long[] inv = new long[MAX];

	public static long Calc(long ret, long n) {
		if(n == 1)
			return ret;
		else if(n % 2 == 1) {
			return (ret * Calc(ret, n - 1)) % mod;
		} else {
			return Calc((ret * ret) % mod, n / 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long ans = 2;
		ans = Calc(ans, n);
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
		}
		long[] com = new long[Math.max(a, b) + 1];
		com[0] = 1;
		for(int i = 1; i < Math.max(a, b) + 1; i++) {
			com[i] = com[i - 1] * (n - i + 1);
			com[i] %= mod;
			com[i] *= inv[i];
			com[i] %= mod;
		}
		while(ans < 0)
			ans += mod;
		ans -= 1;
		ans -= com[a];
		ans -= com[b];
		while(ans < 0)
			ans += mod;
		System.out.println(ans);
	}

}
