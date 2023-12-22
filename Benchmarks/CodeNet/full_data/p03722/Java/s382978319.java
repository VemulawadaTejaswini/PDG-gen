import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int n,m;
	int[]a;
	int[]b;
	long[]c;
	long[][] path;
	long cost=0;
	long Max=Long.MIN_VALUE/2;
	long dp[];
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		b=new int[m];
		c=new long[m];
		path=new long[n+1][n+1];
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextLong();
			path[a[i]][b[i]]=c[i];
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++){
				if(path[i][j]>0 && path[j][i]>0){
					System.out.println("inf");
					return;
				}
			}
		}
		//dp[i]:頂点iまで行く最大のコスト
		dp=new long[n+1];
		Arrays.fill(dp, Long.MIN_VALUE/2);
		dp[1]=0;
		
		System.out.println(dfs(1));
		
	}
	long dfs(int x){
		if(x==n){
			if(Max<cost){
				Max=cost;
				return dp[n]=cost;
			}
		}
		for(int i=1;i<=n;i++){
			if(path[x][i]!=0 && dp[i]<cost+path[x][i]){
				cost+=path[x][i];
				dp[i]=dfs(i);
				cost-=path[x][i];
			}
		}
		return dp[n];
	}
}