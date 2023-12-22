
import java.util.Scanner;

public class Main {

	public static long inf = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long l = sc.nextLong();
		long[][] dist = new long[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dist[i][j] = inf;
			}
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			long c = sc.nextLong();
			dist[a][b] = c;
			dist[b][a] = c;
		}
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					dist[j][i] = dist[i][j];
				}
			}
		}
		long[][] dist2 = new long[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dist2[i][j] = inf;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(dist[i][j] <= l) {
					dist2[i][j] = 1;
					dist2[j][i] = 1;
				}
			}
		}
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					dist2[i][j] = Math.min(dist2[i][j], dist2[i][k] + dist2[k][j]);
					dist2[j][i] = dist2[j][i];
				}
			}
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int s = sc.nextInt() - 1;
			int t = sc.nextInt() - 1;
			if(dist2[s][t] >= inf) {
				System.out.println(-1);
			} else {
				System.out.println(dist2[s][t] - 1);
			}
		}
	}

}
