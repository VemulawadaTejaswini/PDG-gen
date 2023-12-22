

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static Scanner in;
	
	private static int n;
	private static HashMap<Integer, ArrayList<Integer>> g;
	private static long[][] dp;
	private static final int MOD = (int)1e9+7;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		g = new HashMap<>();
		for(int i=0; i<n; i++) {
			g.put(i, new ArrayList<>());
		}
		
		dp = new long[n][2];
		
		for(int i=0; i<n; i++)
			Arrays.fill(dp[i], -1);
		
		for(int i=0; i<n-1; i++) {
			int p = in.nextInt()-1;
			int q = in.nextInt()-1;
			g.get(p).add(q);
			g.get(q).add(p);
		}
		
		
//		System.out.println(dfs(0, -1, 0));
//		System.out.println(dfs(0, -1, 1));
		System.out.println((dfs(0, -1, 0)+dfs(0, -1, 1))%MOD);
	
	}
	
	private static long dfs(int i, int p, int c) {
		
		if (dp[i][c]!=-1) return dp[i][c];
		
		long ans = 1;
		for(int v: g.get(i)) {
			if (v==p) continue;
			
			if (c==0) {
				//white
				ans = (ans*(dfs(v, i, 0)+dfs(v, i, 1)))%MOD;
			} else {
				//black
				ans = (ans*dfs(v, i, 0))%MOD;
			}
		}
		
		return dp[i][c]=ans;
	}

}
