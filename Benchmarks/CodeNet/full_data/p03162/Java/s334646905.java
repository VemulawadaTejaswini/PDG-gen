import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int N = sc.nextInt();
		int act[][] = new int[N + 1][3];
		int dp[][] = new int[N + 1][3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				act[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(j == k)continue;
					dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + act[i][j]);
				}
			}
		}
		int max = MAX + 1;
		for(int i = 0; i < 3; i++) {
			max = Math.max(max, dp[N][i]);
		}
		System.out.println(max);
	}
	int diff(int a, int b) {
		return Math.abs(a - b);
	}




	public static void main(String[] args) {
		new Main().doIt();
	}
}
