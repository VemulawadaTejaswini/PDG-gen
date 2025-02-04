import java.util.*

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[][] = new int[n+1][3];
        int a[] = new int[n]
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) b[i] = sc.nextInt();
        for (int i=0; i<n; i++) c[i] = sc.nextInt();
        dp[0][0] = dp[0][1] = dp[0][2] = 0;
        for (int i=1; i<=n; i++) {
        	dp[i][0] = Math.max(dp[i-1][1] + b[i-1], dp[i-1][2]+c[i-1]);
            dp[i][1] = Math.max(dp[i-1][0] + a[i-1], dp[i-1][2]+c[i-1]);
            dp[i][2] = Math.max(dp[i-1][1] + b[i-1], dp[i-1][0]+a[i-1]);
        }
        int ans = Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2]));
        System.out.println(ans);
    }
}