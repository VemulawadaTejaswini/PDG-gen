import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] x = new int[n + 1];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		int l = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());
		int[] a = new int[q];
		int[] b = new int[q];
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();
		x[n] = x[n - 1] + 1;

		int[][] dr = new int[17][n + 1];
		int r = 1;
		for (int j = 0; j <= n; j++) {
			while (r <= n && x[r] - x[j] <= l) {
				r++;
			}
			dr[0][j] = r - 1;
//			System.out.print(dr[0][j] + "\t");
		}
//		System.out.println();

		for (int i = 1; i < 17; i++) {
			for (int j = 0; j <= n; j++) {
				dr[i][j] = dr[i - 1][dr[i - 1][j]];
//				System.out.print(dr[i][j] + "\t");
			}
//			System.out.println();
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			int now = Math.min(a[i], b[i]);
			int g = Math.max(a[i], b[i]);
			int ans = 0;
			for (int j = 0; j < 17; j++) {
				if (dr[j][now] > g) {
					if (j == 0) {
						ans++;
						break;
					} else {
						ans += 1 << j - 1;
						now = dr[j - 1][now];
						j = -1;
					}
				} else if (dr[j][now] == g) {
					ans += 1 << j;
					break;
				}
			}
			pw.println(ans);
		}
		pw.flush();
	}
}
