import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] dp = new int[100010];
		int[] h = new int[100010];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		for(int i = 0; i < n; i++) h[i] = sc.nextInt();
		
		dp[0] = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <=k; j++) {
				dp[i+j] = Math.min(dp[i+j], dp[i]+Math.abs(h[i]-h[i+j]));
			}
		}
		
		System.out.println(dp[n-1]);
	}
}