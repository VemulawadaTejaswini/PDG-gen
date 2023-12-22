import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		br.close();

		int mod = 1000000007;
		NCR ncr = new NCR(n + 40, mod);
		Map<Integer, Integer> soinsu = bunkai(m);
		long ans = 1;
		for (int val : soinsu.values()) {
			long v = ncr.calc(n + val - 1, val);
			ans *= v;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static Map<Integer, Integer> bunkai(int n) {
		Map<Integer, Integer> soinsu = new HashMap<>();
		int end = (int) Math.sqrt(n);
		int d = 2;
		while (n > 1) {
			if (n % d == 0) {
				n /= d;
				if (soinsu.containsKey(d)) {
					soinsu.put(d, soinsu.get(d) + 1);
				} else {
					soinsu.put(d, 1);
				}
				end = (int) Math.sqrt(n);
			} else {
				if (d > end) {
					d = n - 1;
				}
				d++;
			}
		}
		return soinsu;
	}

	static class NCR {
		long[] p, pi;
		int m;

		public NCR(int n, int mod) {
			n++;
			m = mod;
			p = new long[n];
			pi = new long[n];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < n; i++) {
				p[i] = p[i - 1] * i % m;
			}
			pi[n - 1] = BigInteger.valueOf(p[n - 1])
					.modInverse(BigInteger.valueOf(m)).longValue();
			for (int i = n - 1; i > 1; i--) {
				pi[i - 1] = pi[i] * i % m;
			}
		}

		public long calc(int n, int r) {
			if (n < r) return 0;
			return p[n] * pi[r] % m * pi[n - r] % m;
		}
	}
}
