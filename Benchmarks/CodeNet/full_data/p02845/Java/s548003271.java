import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 1;
		int[] cnt = new int[n + 1];
		for (int i = 0; i < n; i++) {
			int c = cnt[a[i]]++;
			int c1 = Math.max(3 - c, 0);
			if (a[i] == 0) {
				ans *= c1;
				ans %= 1000000007;
			} else {
				int d = cnt[a[i] - 1];
				if (c > d) {
					System.out.println(0);
					return;
				}
				int d1 = Math.max(3 - d, 0);
				ans *= (c1 - d1);
				ans %= 1000000007;
			}
		}
		System.out.println(ans);
	}
}
