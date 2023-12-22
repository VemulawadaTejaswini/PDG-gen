import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long ans = 0;
		for (int i = 29; i > 0; i--) {
			int ki = k >> i & 1;
			if (ki == 0) {
				continue;
			}
			long val = 0;
			label:
			for (int j = 0; j < n; j++) {
				for (int j2 = 29; j2 > i; j2--) {
					int kj2 = k >> j2 & 1;
					int aj2 = a[j] >> j2 & 1;
					if (aj2 > kj2) {
						continue label;
					}
				}
				int kj2 = k >> i & 1;
				int aj2 = a[j] >> i & 1;
				if (aj2 < kj2) {
					val += b[j];
				}
			}
			ans = Math.max(ans, val);
		}
		long val = 0;
		label:
		for (int j = 0; j < n; j++) {
			for (int j2 = 29; j2 > 0; j2--) {
				int kj2 = k >> j2 & 1;
				int aj2 = a[j] >> j2 & 1;
				if (aj2 > kj2) {
					continue label;
				}
			}
			int kj2 = k & 1;
			int aj2 = a[j] & 1;
			if (aj2 <= kj2) {
				val += b[j];
			}
		}
		ans = Math.max(ans, val);
		System.out.println(ans);
	}
}
