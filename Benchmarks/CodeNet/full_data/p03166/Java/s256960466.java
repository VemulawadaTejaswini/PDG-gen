import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] deg=new int[n];
		int[] dp=new int[n];
		ArrayList<Integer>[] G=new ArrayList[n];
		for (int i=0;i<n;++i)
			G[i]=new ArrayList<Integer>();
		while (m-->0) {
			int u=in.nextInt();
			int v=in.nextInt();
			--u;
			--v;
			G[u].add(v);
			++deg[v];
		}
		Queue<Integer> que=new LinkedList<Integer>();
		int res=0;
		for (int i=0;i<n;++i) if (deg[i]==0)
			que.add(i);
		while (!que.isEmpty()) {
			int u=que.peek();
			que.poll();
			for (int i=0;i<G[u].size();++i) {
				int v=G[u].get(i);
				dp[v]=Math.max(dp[v],dp[u]+1);
				res=Math.max(res,dp[v]);
				--deg[v];
				if (deg[v]==0) que.add(v);
			}
		}
		System.out.println(res);
	}
}