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

		int mod = 1000000007;
		long ans = 1;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt++;
			if (a[i] < 2 * cnt - 1) {
				ans *= cnt;
				ans %= mod;
				cnt--;
			}
		}
		for (int i = 1; i <= cnt; i++) {
			ans *= i;
			ans %= mod;
		}
		System.out.println(ans);
	}
}
