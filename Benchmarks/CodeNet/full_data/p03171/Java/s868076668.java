import java.io.*;
import java.util.*; 
import java.lang.*;

public class Main 
{   
    static long[] A;
    static long[][] dp;
    
    static long fn(int i, int j, int c) {
        if (i > j) { return 0; }
        if (dp[i][j] != -1) { return dp[i][j]; }
        if (c == 0) {
            dp[i][j] = Math.max(A[i] + fn(i+1, j, 1), A[j] + fn(i, j-1, 1));
        }
        else {
            dp[i][j] = Math.min(-A[i] + fn(i+1, j, 0), -A[j] + fn(i, j-1, 0));
        }
        return dp[i][j];
    }
    
    public static void main(String[] args) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        A = new long[N];
        for (int n =0; n < N; n ++) {
            A[n] = scan.nextLong();
        }
        dp = new long[N][N];
        for (int i =0; i < N; i ++) {
            for (int j = 0; j < N; j ++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(fn(0, N-1, 0));
    }
}    