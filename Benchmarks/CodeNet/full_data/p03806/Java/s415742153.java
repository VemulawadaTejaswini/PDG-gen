import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ma=sc.nextInt();
		int mb=sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		int dp[][][] = new int[n+1][400+1][400+1];

		int max = 100*40+5;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=400; j++) {
				for(int k=0; k<=400; k++) {
					dp[i][j][k]=max;
				}
			}
		}
		dp[0][0][0]=0;

		for(int i=1; i<=n; i++) {
			for(int j=0; j<=400; j++) {
				for(int k=0; k<=400; k++) {
					dp[i][j][k] = dp[i-1][j][k];
					if(j-a[i-1]>=0 && k-b[i-1]>=0 && dp[i-1][j-a[i-1]][k-b[i-1]]!=max) {
						dp[i][j][k] = Math.min(dp[i][j][k], dp[i-1][j-a[i-1]][k-b[i-1]] + c[i-1]);
					}
				}
			}
		}

		int ans = 100*40+5;
		for(int i=1; i<=400; i++) {
			for(int j=1; j<=400; j++) {
				if(dp[n][i][j] != max) {
					if(i*mb == j*ma) {
						ans = Math.min(ans, dp[n][i][j]);
					}
				}
			}
		}
		if(ans == max) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
		sc.close();
	}


}
