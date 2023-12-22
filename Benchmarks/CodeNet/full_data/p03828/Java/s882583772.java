import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long ex[] = new long[n + 1];

		for (long i = 2; i <= n; i++) {
			Map<Long, Integer> map = primeFactorization(i);

			for (long key : map.keySet()) {
				ex[(int) key] += map.get(key);
			}
		}

		long ans = 1;
		for (long i = 2; i <= n; i++) {
			ans *= (ex[(int) i] + 1);
			ans %= 1000000007;
		}

		System.out.println(ans);
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
