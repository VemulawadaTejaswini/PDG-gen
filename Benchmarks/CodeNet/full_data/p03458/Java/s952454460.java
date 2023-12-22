import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		int k2 = k * 2;
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			if (sa[2].equals("W")) {
				a += k;
			}
			x[i] = a % k2 + 1;
			y[i] = b % k2 + 1;
		}
		br.close();

		int[] dx = {-k, -k, k, k};
		int[] dy = {-k, k, -k, k};
		int[][] cnt = new int[k2 + 1][k2 + 1];
		for (int i = 0; i < n; i++) {
			cnt[x[i]][y[i]]++;
			for (int j = 0; j < 4; j++) {
				int nx = x[i] + dx[j];
				int ny = y[i] + dy[j];
				if (0 < nx && nx <= k2 && 0 < ny && ny <= k2) {
					cnt[nx][ny]++;
				}
			}
		}

		for (int i = 0; i <= k2; i++) {
			for (int j = 0; j < k2; j++) {
				cnt[i][j + 1] += cnt[i][j];
			}
		}
		for (int j = 0; j <= k2; j++) {
			for (int i = 0; i < k2; i++) {
				cnt[i + 1][j] += cnt[i][j];
			}
		}

		int ans = 0;
		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= k; j++) {
				int val = cnt[i + k][j + k] - cnt[i][j + k] - cnt[i + k][j] + cnt[i][j];
				ans = Math.max(ans, val);
			}
		}
		System.out.println(ans);
	}
}
