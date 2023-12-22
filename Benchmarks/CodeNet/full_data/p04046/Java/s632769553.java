import java.util.Scanner;

public class Main {
	static final int MOD = 1000000007;
	static final int MAX = 200000;

	static long[] fac = new long[MAX]; // 1!,2!,...
	static long[] inv = new long[MAX]; // (1)^-1,(2)-1,...(逆元)
	static long[] finv = new long[MAX]; // (1!)^-1,(2!)-1,...(逆元)

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		init_nCr();

		float ans = 0;
		for (int i = 0 ; i < H - A ; i++) {
			ans = (ans + (nCr(B + i - 1, i) * nCr(H - i + W - B - 2, H - i - 1)) % MOD) % MOD;
		}

		System.out.println((int)(ans));

		scanner.close();
	}

	private static void init_nCr() {
		fac[0] = fac[1] = 1;
		inv[1] = 1;
		finv[0] = finv[1] = 1;

		for (int i = 2 ; i < MAX ; i++) {
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	private static long nCr(int n, int r) {
		return fac[n] * (finv[r] * finv[n - r] % MOD) % MOD;
	}
}
