/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    static int[] w;
    static long[] v;
    static int n, W;
    static long[][] dp;
    
    static long solve(int idx, int knapCap)
    {
        //base cases
        if(knapCap<0 || idx==n)
            return 0;
        
        
        if(knapCap<w[idx])
            return solve(idx + 1, knapCap);
        else
        {
            if(dp[idx][knapCap]==-1)
            {
                long temp = Math.max(v[idx] + solve(idx + 1, knapCap - w[idx]), solve(idx + 1, knapCap));
                dp[idx][knapCap] = temp;
                return temp;
            }        
            else
                return dp[idx][knapCap];
        
        }        
    }
	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		n = scn.nextInt();
		W = scn.nextInt();
		w = new int[n];
		v = new long[n];
		for(int i=0;i<n;i++)
		{
		    w[i] = scn.nextInt();
		    v[i] = scn.nextLong();
		}
		dp = new long[n][W + 1];
		for(long[] i:dp )
    		Arrays.fill(i, -1L);
		long ans = solve(0, W);
		
		System.out.println(ans);
	}
}