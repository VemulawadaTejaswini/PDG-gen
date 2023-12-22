import java.util.Scanner;

class Main{
	static long inv(long a, long mod) {
		if(extGCD(a, mod, 0) != 1) return -1; // there is no inverse
		x = 0; y = 0;
		extGCD(a, mod, 0);
		return (x + mod) % mod;
	}
	static long x = 0, y = 0;
	static long extGCD(long a, long b, int c) {
		long d = a;
		if(b != 0) {
			d = extGCD(b, a % b, (c + 1) % 2);
			if(c == 0) y -= (a / b) * x;
			else x -= (a / b) * y;
		}else {
			x = (c == 0) ? 1 : 0;
			y = (c == 0) ? 0 : 1;
		}
		return d;
	}
	static long mod = 1000000000 + 7;
	static long Choose(long n, long k) {
		if(n < k) return 0;
		else if (n == k) return 1;
		long res = fact[(int)n];
		res *= inv_fact[(int)k]; res %= mod;
		res *= inv_fact[(int)(n - k)]; res %= mod;
		return res;
	}
	static long[] fact, inv_fact;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		fact = new long[3000];
		inv_fact = new long[3000];
		fact[0] = 1; inv_fact[0] = 1;
		fact[1] = 1; inv_fact[1] = 1;
		for(int i = 2; i < 3000; i++) {
			fact[i] = fact[i - 1] * (long)i; fact[i] %= mod;
			inv_fact[i] = inv(fact[i], mod);
		}
		int N = sc.nextInt(), K = sc.nextInt();
		long[][] comb = new long[3000][3000];
		for(long i = 0; i <= 2000; i++) {
			for(int j = 0; j <= 2000; j++) comb[(int)i][(int)j] = Choose(i, j);
		}
		for(int i = 1; i <= K; i++) {
			long ans = (comb[N - K + 1][i] * comb[K - 1][i - 1]);
			ans %= mod;
			System.out.println(ans);
		}
	}
}