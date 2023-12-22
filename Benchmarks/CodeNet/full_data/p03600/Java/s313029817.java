;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int INF = 1001001001;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int dp[][] = new int[n][n];
		int a[][] = new int[n][n];
		int tmp[][] = new int[n][n];
		for(int i=0; i<n ;i++) {
			for(int j=0; j<n; j++) {
				dp[i][j]=sc.nextInt();
				a[i][j]=dp[i][j];
				tmp[i][j]=dp[i][j];
			}
		}

		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(dp[i][k]==INF) continue;
				for(int j=0; j<n; j++) {
					if(dp[k][j]==INF) continue;
					if(dp[i][k] + dp[k][j] < a[i][j]) {
						System.out.println(-1);
						sc.close();
						return;
					}
					if(i != k && k != j && i != j && dp[i][k] + dp[k][j] == a[i][j]) {
						tmp[i][j]=INF;
					}
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}

		long ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(tmp[i][j] ==INF) continue;
				ans += tmp[i][j];
			}
		}
		System.out.println(ans/2);

		sc.close();
	}


}
