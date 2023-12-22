import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] alt = new int[n + 2];
                
		for (int i = 1; i <= n; i++) {
                    
			alt[i] = in.nextInt();
		}
		
		int[] dp = new int[n + 2];
                
                for(int i=0;i<n+2;i++){
                    
                }
		Arrays.fill(dp, Integer.MAX_VALUE);
                
		dp[1] = 0;
		
		for (int i = 1; i < n; i++) {
			dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(alt[i] - alt[i + 1]));
			dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(alt[i] - alt[i + 2]));
		}
                
		System.out.println(dp[n]);
	}

}