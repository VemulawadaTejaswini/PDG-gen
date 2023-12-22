import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        
        int[] a = new int[N]; 
        int[] b = new int[N]; 
        int[] c = new int[N]; 
        int[][] dp = new int[N][3];
        
        //A:0 B:1 C:2
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }
        
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        
        for(int i = 1; i <N; i++) {
            dp[i][0] = max(dp[i-1][1]+a[i], dp[i-1][2]+a[i]);
            dp[i][1] = max(dp[i-1][0]+b[i], dp[i-1][2]+b[i]);
            dp[i][2] = max(dp[i-1][0]+c[i], dp[i-1][1]+c[i]);
        }
        
        System.out.println(max(dp[N-1][0] , max(dp[N-1][1], dp[N-1][2])));
    }
    
    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int min(int a, int b) {
        if(a >= b) {
            return b;
        }else {
            return a;
        }
    }
}