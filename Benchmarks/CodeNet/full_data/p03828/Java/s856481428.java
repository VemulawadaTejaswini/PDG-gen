import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long ans = 1;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i <= N; i++) {
			primeFactors(map, i);
		}
		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			ans = (ans % MOD * (m.getValue() + 1)) % MOD;
		}
		System.out.println(ans);
		in.close();

	}

	static Map<Integer, Integer> primeFactors(Map<Integer, Integer> res, int n) {
		if (n == 1) { // n=1 の素因数分解は n^1
			res.put(n, 1);
			return res;
		}
		for (int i = 2, _n = n; i * i <= _n; ++i) {
			while (n % i == 0) {
				res.put(i, res.get(i) == null ? 1 : 1 + res.get(i));// 素数i^{res[i]}
				n /= i;
			}
		}
		if (n != 1)
			res.put(n, res.get(n) == null ? 1 : 1 + res.get(n));
		return res;
	}
}