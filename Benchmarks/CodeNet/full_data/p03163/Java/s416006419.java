import java.util.Scanner;

public class Main {

	private static int N;
	private static int W;
	private static long[][] dp;
	private static int[] w;
	private static int[] v;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		W = sc.nextInt();
		dp = new long[N+1][W+1];
		w = new int[N+1];
		v = new int[N+1];
		w[0] = 0; v[0] = 0;
		for(int i = 1; i <= N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(nap(N, W));
		sc.close();
	}

	private static long nap(int i, int j) {
		if(dp[i][j] >= 0) return dp[i][j];
		long rem;
		if(i == 0) {
			rem = 0;
		}else if(j < w[i]) {
			rem = nap(i-1, j);
		}else {
			rem = Math.max(nap(i-1, j-w[i])+v[i], nap(i-1,j));
		}
		dp[i][j] = rem;
		return rem;
	}

}