import java.util.*;
import java.io.PrintWriter;
public class Main{
	static ArrayList<Integer>[] edge;
	static long mod=1000000007;
	static long[][] dp;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		edge=new ArrayList[n];
		dp=new long[n][2];
		for(int i=0; i<n; i++){
			Arrays.fill(dp[i],1);
		}
		for(int i=0; i<n; i++){
			edge[i]=new ArrayList<>();
		}
		for(int i=1; i<n; i++){
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			edge[x].add(y);
			edge[y].add(x);
		}
		dfs(0,0);
		System.out.println((dp[0][0]+dp[0][1])%mod);
	}
	static void dfs(int now,int from){
		System.out.println(now+" "+from);
		for(int i:edge[now]){
			if(i!=from){
				dfs(i,now);
				dp[now][0]=(dp[now][0]*(dp[i][0]+dp[i][1]))%mod;
				dp[now][1]=dp[now][1]*dp[i][0]%mod;
			}
		}
	}
}