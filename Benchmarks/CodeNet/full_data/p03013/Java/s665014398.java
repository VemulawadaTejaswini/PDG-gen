import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] dp = new int[100000];
      
      	for(int i=0; i<n+1; i++)
        {
          dp[i] = 1;
        }
        
        for(int i = 0; i < m; i++)
        {
            dp[sc.nextInt()] = 0;
        }
        
        for(int i = 2; i < n+1; i++)
        {
            if( dp[i]!=0 ) dp[i] = dp[i-1] + dp[i-2];
        }
        
        System.out.println(dp[n]%1000000007);
    }
}