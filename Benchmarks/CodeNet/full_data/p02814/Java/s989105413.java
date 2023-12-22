import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long m = Long.parseLong(str[1]);

		long a[] = new long[n];

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]) / 2;
		}
		while (a[0] % 2 == 0) {
			for (int i = 0; i < n; ++i) {
				if (a[i] % 2 != 0) {
					System.out.println("0");
					return;
				}
				a[i] /= 2;
			}
			m /= 2;
		}

		for (int i = 0; i < n; ++i) {
			if (a[i] % 2 != 0) {
				System.out.println("0");
				return;
			}
		}

		long lcm = 1;
		for (int i = 0; i < n; ++i) {
			long g = gcd(lcm, a[i]);
			lcm = lcm / g * a[i];
			if (lcm > m) {
				System.out.println("0");
				return;
			}
		}
		System.out.println((m / lcm + 1) / 2);
	}

	static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	static Map<Long, Integer> primeFactorization(long n) {
		Map<Long, Integer> map = new HashMap<>();
		for (long p = 2; p * p <= n; p++) {
			if (n % p != 0)
				continue;
			int cnt = 0;
			while (n % p == 0) {
				cnt++;
				n = n / p;
			}
			map.put(p, cnt);
		}
		if (n > 1)
			map.put(n, 1);

		return map;
	}
}
