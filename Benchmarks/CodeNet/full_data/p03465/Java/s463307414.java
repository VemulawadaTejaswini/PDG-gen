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

		if (n == 1) {
			throw new Exception();
		}
		int m = 2000;
		int m2 = m * m;
		boolean[] dp = new boolean[m2 + 1];
		dp[0] = true;
		for (int i = 0; i < n; i++) {
			for (int j = i * m; j >= 0; j--) {
				dp[j + a[i]] |= dp[j];
			}
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		int start = (sum + 1) / 2;
		for (int i = start; i <= m2; i++) {
			if (dp[i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
