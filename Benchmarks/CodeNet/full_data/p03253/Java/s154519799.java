
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> b = getF(m);
		long mod = 1000000007;
		long ans = 1;
		for (Integer i : b) {
			//System.out.println(i);
			ans = (ans * Tohop(n + i - 1, n-1, mod)) % mod;
		}
		System.out.println(ans);

	}

	static long pow(long a, long b, long MOD) {
		long x = 1, y = a;
		while (b > 0) {
			if (b % 2 == 1) {
				x = (x * y);
				if (x > MOD)
					x %= MOD;
			}
			y = (y * y);
			if (y > MOD)
				y %= MOD;
			b /= 2;
		}
		return x;
	}

	static long InverseEuler(long n, long MOD) {
		return pow(n, MOD - 2, MOD);
	}

	static long Tohop(long n, long m, long MOD) {
		long f = 1;
		long f2 = 1;
		for (long i=m+1;i<=n;i++){
			f = (f*i)% MOD;
			f2 = (f2*(i-m)) % MOD;
		}
		return (f * InverseEuler(f2, MOD)) % MOD;
	}


	private static List<Integer> getF(int m) {
		List<Integer> b = new ArrayList<>();
		int i = 2;
		int c = 0;
		while (i <= m) {
			if (m % i == 0) {
				m /= i;
				c++;
			} else {
				if (c != 0)
					b.add(c);
				c = 0;
				i++;
			}
		}
		if (c != 0)
			b.add(c);
		if (m > 1)
			b.add(1);
		return b;
	}

}
