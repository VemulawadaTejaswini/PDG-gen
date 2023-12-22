import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int[] dp;
	public static path[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		dp = new int[n];
		a = new path[n];
		for (int i = 0; i < n; i++) dp[i] = -1;
		for (int i = 0; i < n; i++) a[i] = new path();
		int x, y;
		for (int i = 0; i < m; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			a[x].list.add(y);
		}
		for (int i = 0; i < n; i++) dfs(i);
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
		sc.close();
	}

	public static class path{
		public ArrayList<Integer> list;
		public path() {
			this.list = new ArrayList<Integer>();
		}
	}

	public static int dfs(int x) {
		if(dp[x] != -1) return dp[x];
		int max = 0;
		if(a[x].list.size()>0) {
			for (int i = 0; i < a[x].list.size(); i++) {
				max = Math.max(max, dfs(a[x].list.get(i)));
			}
			dp[x] = max+1;
		}else {
			dp[x] = 0;
		}
		return dp[x];
	}
}