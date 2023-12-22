import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int n, k;
	static List<List<Integer>> list;
	static int mod = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		n = Integer.parseInt(sa[0]);
		k = Integer.parseInt(sa[1]);
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		long ans = dfs(0, -1, 0);
		ans *= k;
		ans %= mod;
		System.out.println(ans);
	}

	static long dfs(int x, int p, int dep) {
		long ret = 1;
		long s = k - 1;
		if (dep == 0) {
			s = k;
		}
		for (int c : list.get(x)) {
			if (c != p) {
				s--;
				if (s == 0) {
					return 0;
				}
				ret *= s;
				ret %= mod;
				ret *= dfs(c, x, dep + 1);
				ret %= mod;
			}
		}
		return ret;
	}
}
