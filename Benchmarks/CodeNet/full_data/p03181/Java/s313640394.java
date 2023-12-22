import java.util.*;
import java.util.Map.Entry;


import java.io.*;

public class Main{
	static int mod;
	static long dp1[];
	static long dp2[];
	static ArrayList<Integer> g[];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		mod = scn.nextInt();
		dp1 = new long[n + 1];
		dp2 = new long[n + 1];
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int x = scn.nextInt() - 1;
			int y = scn.nextInt() - 1;
			g[x].add(y);
			g[y].add(x);
		}
		solve(0, -1);
		solve2(0, -1, 0L);
		for (int i = 0; i < n; i++) {
			System.out.println(dp2[i]);
		}

	}

	private static void solve2(int sr, int pa, long pa_ans) {
		dp2[sr] = ((1 + pa_ans) * dp1[sr]) % mod;
		long pf[] = new long[g[sr].size()+((sr==0)?1:0)];
		long sf[] = new long[g[sr].size()+((sr==0)?1:0)];
		pf[0] = 1;
		sf[sf.length-1] = 1;
		int x = 1;
		for (int i = 0; i < g[sr].size(); i++) {
			int nei = g[sr].get(i);
			if (sr==0 ||nei != pa) {
				pf[x] = ((dp1[nei] + 1) * pf[x - 1]) % mod;
				x++;
			}

		}
		x = sf.length - 2;
		for (int i = g[sr].size()-1; i >= 0; i--) {
			int nei = g[sr].get(i);
			if (nei != pa || sr==0) {
				sf[x] = ((dp1[nei] + 1) * sf[x + 1]) % mod;
				x--;
			}
		}

		
		x = 1;
		for (int i = 0; i < g[sr].size(); i++) {
			int nei = g[sr].get(i);
			if (nei != pa) {
				long ways = pa_ans + 1;
				ways = (ways * ((x > 0) ? pf[x - 1] : 1)) % mod;
				ways = (ways * ((x <sf.length) ? sf[x] : 1)) % mod;
				solve2(nei, sr, ways);
				x++;
			}
		}

	}

	private static long solve(int sr, int pa) {
		long ans = 1;
		for (int nei : g[sr]) {
			if (nei != pa) {
				ans = (ans * (1 + solve(nei, sr))) % mod;
			}
		}
		dp1[sr] = ans % mod;
		return ans;
	}

}