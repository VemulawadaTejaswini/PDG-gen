/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    static int check;
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		int c[]=new int[n+1];
		int dp[]=new int[n+1];
		int dp2[]=new int[n+1];
		int dp3[]=new int[n+1];
		for(int i=1;i<=n;i++){
		    a[i]=sc.nextInt();
		    b[i]=sc.nextInt();
		    c[i]=sc.nextInt();
		}
		dp[1]=a[1];
		dp2[1]=b[1];
		dp3[1]=c[1];
		for(int i=2;i<=n;i++){
		    dp[i]=a[i]+Math.max(dp2[i-1],dp3[i-1]);
		    dp2[i]=b[i]+Math.max(dp[i-1],dp3[i-1]);
		    dp3[i]=c[i]+Math.max(dp2[i-1],dp[i-1]);
		}
		int ans = Math.max(dp[n],Math.max(dp3[n],dp2[n]));
		System.out.println(ans);
	
	    
	}}