import java.util.*;
public class Main {

	public static void main(String[] args) {
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		long[][] d = new long[N][N];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				if(i != j)
					d[i][j] = INF;
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			int C = sc.nextInt();
			d[A][B] = C;
			d[B][A] = C;
		}
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
		int[][] d2 = new int[N][N];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++) {
				if(i == j)
					continue;
				else if(d[i][j] <= L)
					d2[i][j] = 1;
				else
					d2[i][j] = INF;
			}
		for(int k = 0; k < N; k++)
			for(int i = 0; i < N; i++)
				for(int j = 0; j < N; j++)
					d2[i][j] = Math.min(d2[i][j], d2[i][k] + d2[k][j]);
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			System.out.println(d2[s][t] == INF ? -1 : d2[s][t] - 1);
		}
	}

}