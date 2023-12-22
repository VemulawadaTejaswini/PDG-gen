import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long W = Long.parseLong(sc.next());
        
        long[] w = new long[N+1]; 
        int[] v = new int[N+1]; 
         //i番目の品物までを使って合計の価値をjにするときの重さの最小値
        long[][] dp = new long[N+1][100001];
        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= 100000; j++) {
                dp[i][j] = W+1;
            }
        }
        
        dp[0][0] = 0;
        
        //A:0 B:1 C:2
        for(int i = 0; i < N; i++) {
            w[i+1] = Long.parseLong(sc.next());
            v[i+1] = Integer.parseInt(sc.next());
        }
        
        long ansj = v[1];
        dp[1][0] = 0;
        dp[1][v[1]] = w[1]; 
        
        for(int i = 2; i <= N; i++) {
            for(int j = 0; j <= 100000; j++) {
                if(j - v[i] < 0) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                if(j == v[i] && w[i] < dp[i-1][j]) {
                    dp[i][j] = w[i];
                    if(ansj < j) {
                        ansj = j;
                    }
                }else if(dp[i-1][j-v[i]] + w[i] <= W && dp[i-1][j-v[i]] + w[i] < dp[i-1][j]) {
                    dp[i][j] = min(dp[i-1][j], dp[i-1][j-v[i]] + w[i]);
                    if(ansj < j) {
                        ansj = j;
                    }
                }else  {
                    dp[i][j] = dp[i-1][j];
                }
            }
            
        }

        System.out.println(ansj);
        
    }
    
    public static long max(long a, long b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static int max(int a, int b) {
        if(a >= b) {
            return a;
        }else {
            return b;
        }
    }
    
    public static long min(long a, long b) {
        if(a >= b) {
            return b;
        }else {
            return a;
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