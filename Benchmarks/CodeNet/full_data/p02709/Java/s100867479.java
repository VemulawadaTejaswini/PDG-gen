import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        long[] b = new long[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = (((long)a[i])<<32) + i;
        }
        
        Arrays.sort(b);
        //reverse
        for(int i=0; i<n/2; i++){
            long tmp = b[i];
            b[i] = b[n-1-i];
            b[n-1-i] = tmp;
        }
        
        long[][] dp = new long[n+1][n+1];
        
        for(int i=0; i<n; i++){
            for(int j=0; i+j<n; j++){
                long v = b[i+j]>>32;
                int idx = (int)b[i+j];
                //left(idx - i)
                dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]+v*(idx - i));
                //right(n-1-j - idx)
                dp[i][j+1] = Math.max(dp[i][j+1], dp[i][j]+v*(n-1-j - idx));
            }
        }
        
        long ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, dp[i][n-i]);
        }
        
        System.out.println(ans);
        
    }
}
