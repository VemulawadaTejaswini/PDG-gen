import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Z = sc.nextInt();
		int W = sc.nextInt();
		
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		
		int ans = Math.abs(a[N-1]-W);
		
		int[] dp = new int[N+1];
		
		for(int i=N-1; i>=1; i--) {
			//Y draws Nth
			int min=Math.abs(a[N-1]-a[i-1]);
			
			int maxV=0;
			//Y draws [i+1, N-1]th
			for(int j=N-1; j>i; j--) {
				int max = Math.abs(a[N-1]-a[j-1]);
				if(j<N-1)
					maxV = Math.max(maxV, dp[j+1]);
				max = Math.max(max, maxV);
				if(max<min) {
					min = max;
				}
			}
			dp[i] = min;
		}
		
		for(int i=1; i<N; i++)
			ans = Math.max(ans, dp[i]);
		
		System.out.println(ans);
	}
}
