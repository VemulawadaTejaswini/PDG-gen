
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int MAX = 2500;

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int[] x = new int[N];
	for (int i = 0; i < N; i++) {
	    x[i] = Integer.parseInt(scan.next());
	}

	long[][][] dp = new long[N+1][N+1][MAX+1];
	dp[0][0][0] = 1;
	for (int i = 1; i <= N; i++) {
	    int v = x[i-1];
	    for (int j = 0; j <= N; j++) {
		for (int k = 0; k <= MAX; k++) {
		    if(j-1 >= 0 && k-v >= 0) {
			dp[i][j][k] = dp[i-1][j][k] + dp[i-1][j-1][k-v];
		    } else {
			dp[i][j][k] = dp[i-1][j][k];
		    }
		}
	    }
	}

	long ans = 0;
	for (int i = 1; i <= N; i++) {
	    for (int j = 0; j <= MAX; j++) {
		if(i*A == j) ans += dp[N][i][j];
	    }
	}

	System.out.println(ans);
	scan.close();
    }
}
