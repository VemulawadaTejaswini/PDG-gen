import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[] a = new int[n + 1];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		a[n] = 101;
		br.close();

		int c = 0;
		int cnt = 0;
		int ans = 0;
		for (int i = 0; i <= n; i++) {
			if (a[i] != c) {
				ans += cnt / 2;
				cnt = 0;
				c = a[i];
			}
			cnt++;
		}
		System.out.println(ans);
	}
}
