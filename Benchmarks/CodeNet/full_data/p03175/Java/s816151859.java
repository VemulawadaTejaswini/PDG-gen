import java.util.*;
public class Main {
	static int n;
	static int mod=1000000007;
	static int[][] dp=new int[112345][2];
	static ArrayList<Integer>[] G=new ArrayList[112345];
	static void dfs(int u,int fa) {
		dp[u][0]=dp[u][1]=1;
		for (int i=0;i<G[u].size();++i) {
			int v=G[u].get(i);
			if (v==fa) continue;
			dfs(v,u);
			dp[u][0]=(int)(1L*dp[u][0]*(dp[v][0]+dp[v][1])%mod);
			dp[u][1]=(int)(1L*dp[u][1]*dp[v][0]%mod);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for (int i=1;i<=n;++i)
			G[i]=new ArrayList<Integer>();
		for (int i=0;i<n-1;++i) {
			int x=in.nextInt();
			int y=in.nextInt();
			G[x].add(y);
			G[y].add(x);
		}
		dfs(1,0);
		System.out.println((dp[1][0]+dp[1][1])%mod);
	}
}