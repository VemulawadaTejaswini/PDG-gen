
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int rs[];
	boolean used[];
	int r;
	int INF = 1001001001;
	int ans = INF;
	int dp[][];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		r=sc.nextInt();

		dp= new int[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dp[i][j] = INF;
				if(i==j) {
					dp[i][j]=0;
				}
			}
		}
		rs = new int[r];
		used = new boolean[r];
		for(int i=0; i<r; i++) {
			int v=sc.nextInt();
			v--;
			rs[i]=v;
		}
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;b--;
			int c = sc.nextInt();
			dp[a][b]=c;
			dp[b][a]=c;
		}


		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(dp[i][k]==INF) continue;
				for(int j=0; j<n; j++) {
					if(dp[k][j]==INF) continue;
					dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]);
				}
			}
		}




		for(int i=0; i<r; i++) {
			used[i]=true;
			dfs(rs[i],1,0);
			used[i]=false;
		}

		System.out.println(ans);
		sc.close();
	}

	private void dfs(int u, int n, int dist) {
		if(n==r) {
			ans = Math.min(ans, dist);
			return;
		}
		for(int i=0; i<r; i++) {
			if(!used[i]) {
				used[i]=true;
				int v = rs[i];
				dfs(rs[i],n+1,dist+dp[u][v]);
				used[i]=false;
			}
		}
	}
}
