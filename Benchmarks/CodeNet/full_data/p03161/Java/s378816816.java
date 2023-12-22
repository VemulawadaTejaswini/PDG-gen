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
		int k = scn.nextInt();
		int[] h = new int[n];
		for(int i =0;i<n;i++) {
			h[i] = scn.nextInt();
		}
		
		long ans = find(h,k,0, new Long[n]);
		System.out.println(ans);
	}
	public static long find(int[] h,int k, int idx, Long[] dp) {
		if(idx==h.length-1) {
			return 0;
		}
		if(dp[idx]!=null) {
			return dp[idx];
		}
		long[] temp = new long[k];
		Arrays.fill(temp,  0);
		for(int i =1;i<=k&&idx+i<h.length;i++) {
			temp[i-1] = Math.abs(h[idx]-h[idx+i])+find(h, k, idx+i,dp);
		}
		return dp[idx]=min(temp,Math.min(h.length-idx,k));
	}
	private static long min(long[] temp, int m) {
		// TODO Auto-generated method stub
		long res = Long.MAX_VALUE;
		for(int i =0;i<m;i++) {
			res = Math.min(res, temp[i]);
		}
		return (res==Long.MAX_VALUE)?0:res;
	}
}
