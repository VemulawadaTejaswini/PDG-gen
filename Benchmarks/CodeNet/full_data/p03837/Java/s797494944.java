import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		int dist[][] = new int[n][n];
		final int INF = 1001001001;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					dist[i][j]=0;
				}else {
					dist[i][j]=INF;
				}
			}
		}

		for(int i=0; i<m; i++) {
			a[i]=sc.nextInt();a[i]--;
			b[i]=sc.nextInt();b[i]--;
			c[i]=sc.nextInt();
			dist[a[i]][b[i]]=c[i];
			dist[b[i]][a[i]]=c[i];
		}

		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(dist[i][k]==INF)continue;
				for(int j=0; j<n; j++) {
					if(dist[k][j]==INF)continue;
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
			}
		}

		int cnt=m;
		for(int k=0; k<m; k++) {
			boolean shortest = false;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(dist[i][a[k]] + c[k] + dist[b[k]][j] == dist[i][j]) {
						shortest=true;
					}
				}
			}
			if(shortest) {
				cnt--;
			}
		}
		System.out.println(cnt);

		sc.close();
	}
}
