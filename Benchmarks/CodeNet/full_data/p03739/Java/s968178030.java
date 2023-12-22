import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long val = 0;
		long now = a[0];
		if (a[0] <= 0) {
			val += 1 - a[0];
			now = 1;
		}
		for (int i = 1; i < n; i++) {
			now += a[i];
			if (i % 2 == 0) {
				if (now <= 0) {
					val += 1 - now;
					now = 1;
				}
			} else {
				if (now >= 0) {
					val += now + 1;
					now = -1;
				}
			}
		}
		long ans = val;

		val = 0;
		now = a[0];
		if (a[0] >= 0) {
			val += a[0] + 1;
			now = -1;
		}
		for (int i = 1; i < n; i++) {
			now += a[i];
			if (i % 2 != 0) {
				if (now <= 0) {
					val += 1 - now;
					now = 1;
				}
			} else {
				if (now >= 0) {
					val += now + 1;
					now = -1;
				}
			}
		}
		ans = Math.min(ans, val);
		System.out.println(ans);
	}
}
