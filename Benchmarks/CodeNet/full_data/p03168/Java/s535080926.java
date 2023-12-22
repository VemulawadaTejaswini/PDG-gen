import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] a = new double[n+1];
		double zero = 1;
		for(int i=1;i<=n;i++) {
			a[i] = in.nextDouble();
			zero = zero*(1-a[i]);
		}
		double[][] dp = new double[n][n+1];
		for(int i=1;i<=n;i++) {
			dp[0][i] = dp[0][i-1]+(zero/(1-a[i]))*a[i];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j] = dp[i][j-1]+(dp[i-1][j-1]/(1-a[j]))*a[j];
			}
		}
		/*
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
		double sum = 0;
		for(int i=n/2;i<n;i++) {
			sum+=dp[i][n];
		}
		System.out.println(sum);
	}
}
