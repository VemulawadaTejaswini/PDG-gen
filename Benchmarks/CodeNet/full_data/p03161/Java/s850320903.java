/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Math; 
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[n];
		dp[1] = Math.abs(arr[0]-arr[1]);
		
		for(int i = 2; i < n; i++ ){
		    dp[i] = Integer.MAX_VALUE;
		    for(int j = k; j>0 && i-j > 0; j--){
		        dp[i] = Math.min(dp[i],dp[i-k]+Math.abs(arr[i-k]-arr[i]));
		    }
		}
		System.out.println(dp[n-1]);
		
	}
}