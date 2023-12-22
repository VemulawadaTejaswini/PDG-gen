import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				a[i][j] = Integer.parseInt(sa[j]);
			}
		}
		br.close();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				boolean need = true;
				int r1 = a[i][j];
				for (int k = 0; k < n; k++) {
					if (i == k || j == k) {
						continue;
					}
					int r2 = a[i][k] + a[k][j];
					if (r1 > r2) {
						System.out.println(-1);
						return;
					}
					if (r1 == r2) {
						need = false;
					}
				}
				if (need) {
					ans += r1;
				}
			}
		}
		System.out.println(ans);
	}
}
