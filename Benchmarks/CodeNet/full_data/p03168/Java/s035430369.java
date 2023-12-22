import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		double[] a = new double[n];
		
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			a[i] = Double.parseDouble(input[i]);
		}
		
		double ans = solve(a);
		
		System.out.println(ans);
	}

	private static double solve(double[] a) {
		
		double[][] dp = new double[a.length+1][a.length+1];
		
		dp[0][0]=1;
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(j==0) {
					dp[i][j] = (1-a[i-1])*dp[i-1][j];
				}else {
					dp[i][j] = (1-a[i-1])*dp[i-1][j]+a[i-1]*dp[i-1][j-1];
				}
			}
		}
		
		double res = 0;
		
		for(int i=((a.length/2)+1); i<=a.length; i++) {
			res += dp[a.length][i];
		}
		
		return res;
	}
}
