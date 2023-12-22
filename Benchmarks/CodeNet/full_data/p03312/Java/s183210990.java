import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] b = new int[n];
		b[0] = a[0];
		for (int i = 1; i < n; i++) {
			b[i] = b[i - 1] + a[i];
		}

		int[] p = new int[4];
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < n - 2; i++) {
			int start = 0;
			int end = i - 1;
			while (Math.abs(end - start) > 1) {
				int mid = (end + start) / 2;
				int c = b[i] - b[mid] * 2;
				if (c < 0) {
					end = mid;
				} else {
					start = mid;
				}
			}
			int val1 = Integer.MAX_VALUE;
			p[0] = b[start];
			p[1] = b[i] - b[start];
			if (p[0] > 0 && p[1] > 0) {
				val1 = Math.abs(p[0] - p[1]);
			}
			p[0] = b[end];
			p[1] = b[i] - b[end];
			int val2 = Math.abs(p[0] - p[1]);
			if (p[0] > 0 && p[1] > 0 && val1 > val2) {
			} else {
				p[0] = b[start];
				p[1] = b[i] - b[start];
			}

			start = i + 1;
			end = n - 2;
			while (Math.abs(end - start) > 1) {
				int mid = (end + start) / 2;
				int c = b[n - 1] - b[mid] * 2 + b[i];
				if (c < 0) {
					end = mid;
				} else {
					start = mid;
				}
			}
			val1 = Integer.MAX_VALUE;
			p[2] = b[start] - b[i];
			p[3] = b[n - 1] - b[start];
			if (p[2] > 0 && p[3] > 0) {
				val1 = Math.abs(p[2] - p[3]);
			}
			p[2] = b[end] - b[i];
			p[3] = b[n - 1] - b[end];
			val2 = Math.abs(p[2] - p[3]);
			if (p[2] > 0 && p[3] > 0 && val1 > val2) {
			} else {
				p[2] = b[start] - b[i];
				p[3] = b[n - 1] - b[start];
			}

			int val = max(p) - min(p);
			ans = Math.min(ans, val);
		}
		System.out.println(ans);
	}

	static int max(int[] p) {
		int ret = p[0];
		for (int i = 1; i < p.length; i++) {
			ret = Math.max(ret, p[i]);
		}
		return ret;
	}

	static int min(int[] p) {
		int ret = p[0];
		for (int i = 1; i < p.length; i++) {
			ret = Math.min(ret, p[i]);
		}
		return ret;
	}
}
