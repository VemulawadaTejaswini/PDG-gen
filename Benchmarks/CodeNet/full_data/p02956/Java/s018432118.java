import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		zaatu(x);
		zaatu(y);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.x = x[i];
			o.y = y[i];
			arr[i] = o;
		}
		Arrays.sort(arr, (o1, o2) -> o1.x - o2.x);

		int[] lol = new int[n];
		int[] hil = new int[n];
		BIT bit = new BIT(n);
		for (int i = 0; i < n; i++) {
			lol[i] = bit.sum(arr[i].y);
			hil[i] = i - lol[i];
			bit.add(arr[i].y, 1);
		}

		int[] lor = new int[n];
		int[] hir = new int[n];
		bit = new BIT(n);
		for (int i = 0; i < n; i++) {
			int ri = n - 1 - i;
			lor[ri] = bit.sum(arr[ri].y);
			hir[ri] = i - lor[ri];
			bit.add(arr[ri].y, 1);
		}

		int mod = 998244353;
		long ans = n * power(2, n - 1, mod) % mod;
		for (int i = 0; i < n; i++) {
			long val1 = power(2, lol[i], mod);
			long val2 = power(2, hil[i], mod);
			long val3 = power(2, lor[i], mod);
			long val4 = power(2, hir[i], mod);
			long val11 = (val1 - 1 + mod) % mod;
			long val21 = (val2 - 1 + mod) % mod;
			long val31 = (val3 - 1 + mod) % mod;
			long val41 = (val4 - 1 + mod) % mod;
			ans += val11 * val21 % mod * val31 % mod * val41 % mod;
			ans += val11 * val21 % mod * val31 % mod;
			ans += val11 * val21 % mod * val41 % mod;
			ans += val11 * val31 % mod * val41 % mod;
			ans += val21 * val31 % mod * val41 % mod;
			ans += val11 * val41 % mod;
			ans += val21 * val31 % mod;
			ans %= mod;
		}
		System.out.println(ans);
	}

	static long power(long x, long n, int m) {
		if (n == 0) {
			return 1;
		}
		long val = power(x, n / 2, m);
		val = val * val % m;
		if (n % 2 == 1) {
			val = val * x % m;
		}
		return val;
	}

	static void zaatu(int[] a) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], null);
		}
		Integer[] arr = map.keySet().toArray(new Integer[0]);
		int cnt = 0;
		for (Integer i : arr) {
			cnt++;
			map.put(i, cnt);
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = map.get(a[i]);
		}
	}

	static class BIT {
		int n;
		int[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new int[n + 1];
		}

		void add(int idx, int val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		int sum(int idx) {
			int sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}

	static class Obj {
		int x, y;
	}
}
