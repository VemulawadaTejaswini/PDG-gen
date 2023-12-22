import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Main{
	static int[] dp;
	static LinkedList<Integer>[] graph;
	static int rec(int v) {
		if(dp[v] != -1) return dp[v];

		int ret = 0;
		for(int u : graph[v]) {
			ret = Math.max(ret, rec(u) + 1);
		}
		return dp[v] = ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), M = sc.nextInt();
			graph = new LinkedList[N];
			for(int i = 0; i < N; i++) graph[i] = new LinkedList<Integer>();
			for(int i = 0; i < M; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				graph[x - 1].add(y - 1);
			}
			dp = new int[N];
			Arrays.fill(dp, -1);
			int ans = 0;
			for(int i = 0; i < N; i++) ans = Math.max(ans, rec(i));
			System.out.println(ans);
		}
	}
}