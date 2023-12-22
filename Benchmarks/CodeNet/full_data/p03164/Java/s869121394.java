import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long[] w = new long[n+1];
		long[] v = new long[n+1];
		long max = 0;
		for(int i=1;i<=n;i++) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();
			if(v[i]>max) {
				max = v[i];
			}
		}
		long[][] dp = new long[n+1][(int)max*n+1];
		for(int i=1;i<=(int)max*n;i++) {
			dp[0][i] = 1000000000;
			dp[0][i] = dp[0][i]*100;
		}
		dp[0][0] = 0;
		for(int i=1;i<=n;i++) {
			dp[i][0] = 0;
			for(int j=1;j<=(int)max*n;j++){
				dp[i][j] = dp[i-1][j];
				//System.out.println(i+" "+j+" "+(j-(int)v[i]));
				if(j>=v[i])dp[i][j] = Math.min(dp[i][j], dp[i-1][j-(int)v[i]]+w[i]);
			}
		}
		/*
		for(int i=0;i<=n;i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
		for(int i=dp[0].length-1;i>=0;i--) {
			if(dp[n][i]<=m) {
				System.out.println(i);
				break;
			}
		}
	}
}