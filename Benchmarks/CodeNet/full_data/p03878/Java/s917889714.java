import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		br.close();

		int mod = 1000000007;
		long[] p = new long[n + 1];
		p[0] = 1;
		for (int i = 1; i <= n; i++) {
			p[i] = p[i - 1] * i % mod;
		}

		Arrays.sort(a);
		Arrays.sort(b);
		List<Integer> list = new ArrayList<>();
		int j = 0;
		int pre = 0;
		for (int i = 0; i < n; i++) {
			while (j < n && a[j] < b[i]) {
				j++;
			}
			list.add(j - pre);
			pre = j;
		}
		list.add(n - pre);

		long ans = 1;
		int cnt1 = 0;
		int cnt2 = 0;
		int ai = 0;
		int bi = 0;
		while (bi < n) {
			while (ai <= bi) {
				cnt1 += list.get(ai);
				ai++;
			}
			if (cnt1 > 0) {
				if (cnt1 >= cnt2) {
					ans *= p[cnt2];
					ans %= mod;
					cnt1 -= cnt2;
					ans *= p[cnt1];
					ans %= mod;
					bi += cnt1;
					cnt1 = 0;
					cnt2 = 0;
				} else {
					ans *= p[cnt1];
					ans %= mod;
					cnt2 -= cnt1;
					cnt1 = 0;
				}
			} else {
				bi++;
				cnt2++;
			}
		}
		ans *= p[list.get(n)];
		ans %= mod;
		System.out.println(ans);
	}
}
