import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		String[] input = br.readLine().split(" ");
		
		for (int i = 0; i < input.length; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		
		int ans = solve(a);
		
		System.out.println(ans);
	}

	private static int solve(int[] a) {
		
		int[] dp = new int[a.length];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int i = 0; i < dp.length; i++) {
			
			if((i+1)<a.length)
				dp[i+1] = Math.min(dp[i+1],dp[i]+ Math.abs(a[i]-a[i+1]));
			
			if((i+2)<a.length)
				dp[i+2] = Math.min(dp[i+2],dp[i]+ Math.abs(a[i]-a[i+2]));
			
		}
		
		return dp[a.length-1];
	}
}