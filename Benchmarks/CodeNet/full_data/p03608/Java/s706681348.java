import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static int r;
	static int[] x;
	static long[][] d;
	static long ans = 10000000000L;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		r = Integer.parseInt(sa[2]);

		x = new int[r];
		sa = br.readLine().split(" ");
		for (int i = 0; i < r; i++) {
			x[i] = Integer.parseInt(sa[i]) - 1;
		}

		d = new long[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(d[i], 10000000000L);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			int c = Integer.parseInt(sa[2]);
			d[a][b] = c;
			d[b][a] = c;
		}
		br.close();

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		dfs(new ArrayList<Integer>());

		System.out.println(ans);
	}

	static void dfs(List<Integer> list) {
		if (list.size() == r) {
			long sum = 0;
			for (int i = 1; i < r; i++) {
				sum += d[list.get(i - 1)][list.get(i)];
			}
			ans = Math.min(ans, sum);
			return;
		}

		for (int i = 0; i < r; i++) {
			if (!list.contains(x[i])) {
				list.add(x[i]);
				dfs(list);;
				list.remove(list.size() - 1);
			}
		}
	}
}
