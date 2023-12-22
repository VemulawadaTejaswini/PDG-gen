import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[3];
		for (int i = 0; i < 3; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		int[] ab = new int[3];
		int[] ba = new int[3];
		for (int i = 0; i < 3; i++) {
			ab[i] = b[i] - a[i];
			ba[i] = a[i] - b[i];
		}
		br.close();

		int[] dp1 = new int[n + 1];
		for (int i = 0; i < 3; i++) {
			for (int w = 0; w + a[i] <= n; w++) {
				dp1[w + a[i]] = Math.max(dp1[w + a[i]], dp1[w] + ab[i]);
			}
		}
		int m = dp1[n] + n;
		long[] dp2 = new long[m + 1];
		for (int i = 0; i < 3; i++) {
			for (int w = 0; w + b[i] <= m; w++) {
				dp2[w + b[i]] = Math.max(dp2[w + b[i]], dp2[w] + ba[i]);
			}
		}
		System.out.println(dp2[m] + m);
	}
}
