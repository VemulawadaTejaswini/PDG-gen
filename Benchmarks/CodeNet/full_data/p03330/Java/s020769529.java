import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int c = Integer.parseInt(sa[1]);
		int[][] d = new int[c][c];
		for (int i = 0; i < c; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < c; j++) {
				d[i][j] = Integer.parseInt(sa[j]);
			}
		}
		int[][] cnt = new int[3][c];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				int x = (i + j) % 3;
				cnt[x][Integer.parseInt(sa[j]) - 1]++;
			}
		}
		br.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < c; j++) {
				if (i == j) continue;
				for (int k = 0; k < c; k++) {
					if (i == k || j == k) continue;
					int sum = 0;
					for (int x = 0; x < c; x++) {
						sum += cnt[0][x] * d[x][i];
						sum += cnt[1][x] * d[x][j];
						sum += cnt[2][x] * d[x][k];
					}
					ans = Math.min(ans, sum);
				}
			}
		}
		System.out.println(ans);
	}
}
