import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		int[] u = new int[M];
		int[] v = new int[M];
		int[] a = new int[M];
		int[] b = new int[M];
		for (int i=0;i<M;i++) {
			u[i] = sc.nextInt()-1;
			v[i] = sc.nextInt()-1;
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int[] c = new int[N];
		int[] d = new int[N];
		for (int i=0;i<N;i++) {
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}

		long INF = 3_000_000_000_000_000_000L;
		long[][] dp = new long[N][10050]; // dp[pos][money]
		for (int i=0;i<N;i++) {
			for (int j=0;j<10050;j++) {
				dp[i][j] = INF;
			}
		}
		dp[0][S] = 0;
		for (int j=0;j<10050;j++) {
			if (j+c[0]<10050) dp[0][j+c[0]] = Math.min(dp[0][j+c[0]], dp[0][j]+d[0]);
		}

		for (int i=0;i<200;i++) {
			for (int k=0;k<M;k++) {
				for (int j=0;j<10050;j++) {
					if (j+c[u[k]]<10050) dp[u[k]][j+c[u[k]]] = Math.min(dp[u[k]][j+c[u[k]]], dp[u[k]][j]+d[u[k]]);
				}
				for (int j=0;j<10050;j++) {
					if (j-a[k]>=0) dp[v[k]][j-a[k]] = Math.min(dp[v[k]][j-a[k]], dp[u[k]][j]+b[k]);
				}
				for (int j=0;j<10050;j++) {
					if (j-a[k]>=0) dp[u[k]][j-a[k]] = Math.min(dp[u[k]][j-a[k]], dp[v[k]][j]+b[k]);
				}
				for (int j=0;j<10050;j++) {
					if (j+c[v[k]]<10050) dp[v[k]][j+c[v[k]]] = Math.min(dp[v[k]][j+c[v[k]]], dp[v[k]][j]+d[v[k]]);
				}
			}
		}

		for (int i=1;i<N;i++) {
			long ans = INF;
			for (int j=0;j<10050;j++) {
				ans = Math.min(ans, dp[i][j]);
			}
			System.out.println(ans);
		}

		// for (int i=0;i<N;i++) {
		// 	StringBuilder sb = new StringBuilder();
		// 	for (int j=0;j<10;j++) {
		//  		sb.append(dp[i][j]);
		//  		sb.append(" ");
		// 	}
		// 	System.out.println(sb);
		// }
	}
}