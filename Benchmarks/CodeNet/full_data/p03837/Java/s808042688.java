import java.util.*;

public class Main {


	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	int dist[][];
	int a[];
	int b[];
	int cost[];
	int n;
	int INF = 1000*1000+5;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		dist = new int[n][n];
		a = new int[m];
		b = new int[m];
		cost = new int[m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				dist[i][j]=INF;
				if(i==j) {
					dist[i][j]=0;
				}
			}
		}
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			s--;
			t--;
			int c = sc.nextInt();
			dist[s][t]=c;
			dist[t][s]=c;
			a[i]=s;
			b[i]=t;
			cost[i]=c;
		}
		f();

		int ans = m;
		for(int k=0; k<m; k++) {
			boolean shortest=false;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(dist[i][j] == dist[i][a[k]] + cost[k] + dist[b[k]][j]) {
						shortest=true;
					}
				}
			}
			if(shortest) {
				ans--;
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private void f() {
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(dist[i][k] == INF) continue;
				for(int j=0; j<n; j++) {
					if(dist[k][j] == INF) continue;
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}
	}
}
