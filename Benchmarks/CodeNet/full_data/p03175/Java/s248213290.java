

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Vector<Integer> a[];
	static long dp[][];
	static int n;
	static long mod = 1000000009;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new Vector[n];
		dp = new long[n][2];
		for (int i = 0; i < n; i++)
			a[i] = new Vector<>();
		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}
		int root = 0;
		for (int i = 0; i < n; i++)
			if (a[root].size()>a[i].size()) root = i;

		f(root,-1);
		System.out.println((dp[root][0]+dp[root][1])%mod);
	}

	private static void f(int r,int f) {
			dp[r][0] = dp[r][1] = 1;
		
		for (int i=0;i<a[r].size();i++) {
			int c = a[r].get(i);
			if (c==f) continue;
			f(c,r);
			dp[r][0] = (dp[r][0] * (dp[c][0]+dp[c][1]))%mod;
			dp[r][1] = (dp[r][1] * dp[c][0])%mod;
		}
	}
}
