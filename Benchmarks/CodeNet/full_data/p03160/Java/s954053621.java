package com.practice.atcoder;

import java.io.*;

public class Main {
	static long[] dp;
	  
	public static long minCost(long[] arr, int pos){
	  	if(pos<0) return 0;
	    if(dp[pos]!=-1) return dp[pos];
	    return dp[pos] = 
	      Math.min(minCost(arr, pos-1)+Math.abs(arr[Math.max(pos, 0)]-arr[Math.max(pos-1, 0)]),
	               minCost(arr, pos-2)+Math.abs(arr[Math.max(pos, 0)]-arr[Math.max(pos-2, 0)]));
	}
	  
	public static void main(String[] args) throws Exception{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    long[] arr = new long[n];
	    dp = new long[n];
	    String[] str = br.readLine().split(" ");
	    for(int i=0; i<n; i++) {
	    	arr[i] = Long.parseLong(str[i]);
	    	dp[i] = -1;
	    }
		System.out.println(minCost(arr, n-1));
		//for(int i=0; i<n; i++) System.out.print(dp[i]+" ");
	}
}
