import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine()) - k;
		}
		br.close();

		long[] b = new long[n + 1];
		for (int i = 0; i < n; i++) {
			b[i + 1] = b[i] + a[i];
		}

		int[] c = zaatu(b);
		long t = tentousuu(c);
		long ans = (long) n * (n + 1) / 2 - t;
		System.out.println(ans);
	}

	static int[] zaatu(long[] a) {
		TreeMap<Long, Integer> map = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], null);
		}
		Long[] arr = map.keySet().toArray(new Long[0]);
		int cnt = 0;
		for (Long i : arr) {
			cnt++;
			map.put(i, cnt);
		}
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = map.get(a[i]);
		}
		return b;
	}

	static long tentousuu(int[] a) {
		int n = a.length;
		BIT bit = new BIT(n + 1);
		long ret = 0;
		for (int i = 0; i < n; i++) {
			ret += i - bit.sum(a[i]);
			bit.add(a[i], 1);
		}
		return ret;
	}

	static class BIT {
		int n;
		long[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new long[n + 1];
		}

		void add(int idx, long val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		long sum(int idx) {
			long sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
