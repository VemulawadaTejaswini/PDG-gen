//package atcoderdp;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int[] h = new int[n];
		for(int i =0;i<n;i++) {
			h[i] = scn.nextInt();
		}
		
		long ans = find(h,0, new Long[n]);
		System.out.println(ans);
	}
	public static long find(int[] h, int idx, Long[] dp) {
		if(idx==h.length-1) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		long c1 = Integer.MAX_VALUE;
		long c2 = Integer.MAX_VALUE;
		if(idx+1<h.length) {
			c1 = Math.abs(h[idx]-h[idx+1])+find(h,idx+1,dp);
		}
		if(idx+2<h.length) {
			c2 = Math.abs(h[idx]-h[idx+2])+find(h, idx+2,dp);
		}
		return dp[idx]=Math.min(c1, c2);
	}
}
