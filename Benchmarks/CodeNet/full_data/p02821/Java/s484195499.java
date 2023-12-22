import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long m = Long.parseLong(sa[1]);
		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);
		long ng = 1;
		long ok = a[n - 1] * 2 + 1;
		while (ok - ng > 1) {
			long mid = (ok + ng) / 2;
			long cnt = 0;
			for (int i = 0; i < n; i++) {
				int idx = binarySearch(a, mid - a[i] - 0.5);
				cnt += n - idx;
			}
			if (cnt < m) {
				ok = mid;
			} else {
				ng = mid;
			}
		}

		long[] b = new long[n + 1];
		for (int i = 0; i < n; i++) {
			b[i + 1] = b[i] + a[i];
		}

		long ans = 0;
		long cnt = 0;
		for (int i = 0; i < n; i++) {
			int idx = binarySearch(a, ng - a[i] - 0.5);
			long c = n - idx;
			cnt += c;
			long val = a[i] * c + (b[n] - b[idx]);
			ans += val;
		}
		ans -= (cnt - m) * ng;
		System.out.println(ans);
	}

	static int binarySearch(long[] array, double val) {
		int start = -1;
		int end = array.length;

		while (Math.abs(end - start) > 1) {
			int mid = (end + start) / 2;
			if (mid == array.length) {
				return mid;
			}
			if (array[mid] >= val) {
				end = mid;
			} else {
				start = mid;
			}
		}
		return end;
	}
}
