import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int ans = 0;
		for (int k = 0; k < 29; k++) {
			int m = 1 << (k + 1);
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				c[i] = b[i] % m;
			}
			Arrays.sort(c);

			int min = m / 2;
			int max = m - 1;
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				int ai = a[i] % m;
				int mina = min - ai;
				int maxa = max - ai;
				if (mina < 0) {
					mina += m;
					int idxc = ceiling(c, mina);
					cnt += n - idxc;
					int idxf = floor(c, maxa);
					cnt += idxf + 1;
				} else {
					int idxc = ceiling(c, mina);
					int idxf = floor(c, maxa);
					cnt += idxf - idxc + 1;
				}
			}
			if (cnt % 2 == 1) {
				ans += 1 << k;
			}
		}
		System.out.println(ans);
	}

	static int floor(int[] array, int val) {
		int ok = -1;
		int ng = array.length;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] <= val) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
	}

	static int ceiling(int[] array, int val) {
		int ok = array.length;
		int ng = -1;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] >= val) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
	}
}
