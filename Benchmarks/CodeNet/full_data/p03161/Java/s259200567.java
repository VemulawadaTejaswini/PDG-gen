import java.util.*;
public class Main{
    static long[] dp = new long[1000000];
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        
        int n = sc.nextInt();
        int h[] = new int[n];

        for(int i=0; i<n; i++) h[i] = sc.nextInt();

        dp[1] = Math.abs(h[0]-h[1]);
        for(int i=2; i<n; i++){
            for(int j=1; j<=k; j++)
            dp[i+j] = Math.min(dp[i+j],dp[i]+Math.abs(h[i]-h[i+j]));
        }
        System.out.println(dp[n-1]);
        
    }
    
}
