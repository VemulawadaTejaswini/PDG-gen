import java.util.Scanner;

public class Main {

	//Fermat Combination
	static int mod = (int) 1e9 + 7;

	static long fermatComb(long a, long b) {
		if (b > a - b)
			return fermatComb(a, a - b);
		long mul = 1; //分子
		long div = 1; //分母
		for (int i = 0; i < b; i++) {
			mul *= (a - i);
			mul %= mod;
			div *= (i + 1);
			div %= mod;
		}
		long ans = mul * modpow(div, mod - 2) % mod; //フェルマーの小定理を利用して掛け算で計算
		return ans;
	}

	//mod条件下の高速pow
	static long modpow(long a, long p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			long root = modpow(a, p / 2);
			return root * root % mod;
		} else
			return a * modpow(a, p - 1) % mod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		long N = 1;
		for (int i = 0; i < n; i++) {
			N *= 2;
			N %= 1e9 + 7;

		}

		N--;//全て取らない場合を考えない

		long A = fermatComb(n, a);
		if (A < 0) {
			A += (1e9 + 7);
		}

		long B = fermatComb(n, b);
		if (B < 0) {
			B += (1e9 + 7);
		}
		N -= A;
		if (N < 0) {
			N += (1e9 + 7);
		}
		N -= B;
		if (N < 0) {
			N += (1e9 + 7);
		}
		N %= (1e9 + 7);
		System.out.println(N);

	}
}
