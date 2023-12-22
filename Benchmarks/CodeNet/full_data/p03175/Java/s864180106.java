import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int mod = 1000000007;
	static List<List<Integer>> list;
	static long[] dp0, dp1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int x = Integer.parseInt(sa[0]) - 1;
			int y = Integer.parseInt(sa[1]) - 1;
			list.get(x).add(y);
			list.get(y).add(x);
		}
		br.close();

		dp0 = new long[n];
		dp1 = new long[n];
		dfs(0, -1);
		System.out.println((dp0[0] + dp1[0]) % mod);
	}

	static void dfs(int cur, int p) {
		dp0[cur] = 1;
		dp1[cur] = 1;
		for (int next : list.get(cur)) {
			if (next == p) {
				continue;
			}
			dfs(next, cur);
			dp1[cur] *= dp0[next];
			dp1[cur] %= mod;
			dp0[cur] *= (dp0[next] + dp1[next]);
			dp0[cur] %= mod;
		}
	}
}
