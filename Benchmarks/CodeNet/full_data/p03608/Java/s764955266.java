
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	long INF = 100000000000000000L;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int r[] = new int[R];
		for(int i=0; i<R; i++) {
			r[i] = sc.nextInt();
		}
		long g[][] = new long[N+1][N+1];
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				g[i][j] = INF;
			}
		}
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			long c = sc.nextLong();
			g[a][b]=c;
			g[b][a]=c;
		}
		long d[][] = new long[N+1][N+1];
		solve(d, N+1, g, r, R);
		sc.close();
	}

	private void solve(long d[][], int n, long g[][], int r[],  int c) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				d[i][j]=INF;
				if(i==j)d[i][j]=0;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(g[i][j] != INF) {
					d[i][j]=g[i][j];
				}
			}
		}
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(g[i][k]==INF) continue;
				for(int j=0; j<n; j++) {
					if(g[k][j]==INF) continue;
					d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}
		boolean used[] = new boolean[c];
		long ans = INF;
		for(int i=0; i<c; i++) {
			used[i]=true;
			ans = Math.min(ans, solve2(d,r,c,used, i));
			used[i]=false;
		}
		System.out.println(ans);
	}

	private long solve2(long d[][], int r[], int c, boolean used[], int prev) {
		long ans = 0;
		for(int i=0; i<c; i++) {
			if(!used[i]) {
				used[i]=true;
				ans = solve2(d,r,c,used, i) + d[r[prev]][r[i]];
				used[i]=false;
			}
		}
		return ans;
	}
}
