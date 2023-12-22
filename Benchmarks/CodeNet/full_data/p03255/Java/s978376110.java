import java.util.*;
import java.io.*;

public class Main {
    public static long solve(int N, long X, long[] x){
        long[] dp = new long[N];
        //total cost when trash 0~i are put into the garbage box
        //the final answer is dp[N-1]
        
        dp[0] = x[0] + X + 4*x[0] + X;
        
        for(int n=1;n<N;n++){
        	dp[n] = x[n] + X + 4*x[n] + X + dp[n-1];
        	long energy = x[n];
        	energy += X;
        	for(int m=n-1;m>=0;m--){
        	    energy += (x[m+1]-x[m])*(n-m+1)*(n-m+1)+X;
        	    long cur = energy + x[m]*(n-m+2)*(n-m+2) + X + (m>0 ? dp[m-1] : 0);
        	    dp[n] = Math.min(dp[n], cur);
        	}
        }
        return dp[N-1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] x = new long[N];
        for(int n=0;n<N;n++)x[n]=sc.nextLong();
        
        System.out.println(solve(N,X,x));
    }
}