import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] dp = new int[h+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		int min = Integer.MAX_VALUE;
		dp[0] = 0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(b<min)
				min = b;
			
			for(int j=1;j<=h;j++) {
				if(0<=j-a && dp[j-a]!=Integer.MAX_VALUE)
					dp[j] = Math.min(dp[j], dp[j-a]+b);
			}
		}
		
		for(int i=h;i>=0;i--) {
			if(dp[i]!=Integer.MAX_VALUE) {
				System.out.println(i==h ? dp[i] : dp[i]+min);
				break;
			}
		}
		
	}
}