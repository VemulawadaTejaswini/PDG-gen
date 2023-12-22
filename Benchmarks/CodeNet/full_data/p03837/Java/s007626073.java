import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int INF = (int)1e9;
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] g=new int[n-1][n+1];
		int[][] c=new int[n-1][n+1];
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				g[i][j] = INF;
			}
			g[i][i] = 0;
		}
		
		for(int i=0;i<m;i++){
			int u=sc.nextInt(),v=sc.nextInt(),w=sc.nextInt();
			g[u][v] = w;
			g[v][u] = w;
			c[u][v] = w;
			c[v][u] = w;
		}
		
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					g[i][j] = Math.min(g[i][j],g[i][k]+g[k][j]);
		
		int ans = 0;
		for(int i=1;i<=n;i++){
			for(int j=i+1;j<=n;j++){
				if(c[i][j]>g[i][j])
					ans++;
			}
		}
		System.out.println(ans);
	}
}