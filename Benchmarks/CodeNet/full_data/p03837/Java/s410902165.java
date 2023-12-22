import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //頂点
		int m = sc.nextInt(); //辺
		int[][] dist = new int[n+1][n+1];
		int[] a = new int[m];
		int[] b = new int[m];
		int[][] edge = new int[n+1][n+1];
		boolean[][] count=new boolean[n+1][n+1];
		int ans=0;
		
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			edge[a[i]][b[i]] = sc.nextInt();
		}
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				dist[i][j] = edge[i][j];
			}
		}
		// ワーシャルフロイド法で最短距離を計算
		for (int k = 1; k < n+1; k++) {
			for (int i = 1; i < n+1; i++) {
				for (int j = 1; j < n+1; j++) {
						dist[i][j] = Math.min(dist[i][j],dist[i][k] + dist[k][j]);
				}
			}
		}
		for (int s = 1; s < n+1; s++) {
			for (int t = 1; t < n+1; t++) {
				for (int i = 0; i < m; i++) {
					if (dist[s][t] == dist[s][a[i]] + edge[a[i]][b[i]] + dist[b[i]][t] ||
							dist[s][t] == dist[s][b[i]] + edge[b[i]][a[i]] + dist[a[i]][t] ) {
						count[a[i]][b[i]]=true;
					}
				}
			}
		}
		for(int i=0;i<m;i++){
			if(count[a[i]][b[i]])ans++;
		}
		System.out.println(m-ans);
	}
}
