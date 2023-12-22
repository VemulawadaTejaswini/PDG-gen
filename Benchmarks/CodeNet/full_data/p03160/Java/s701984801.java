import java.util.*;


import java.io.*;
import java.math.BigInteger;


public class Main 
{   
	static int dp[];
	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();
		
		
		int dp[]=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(ar[1]-ar[0]);
		for(int i=2;i<n;i++) {
			dp[i]=Math.min(dp[i-1]+Math.abs(ar[i]-ar[i-1]), dp[i-2]+Math.abs(ar[i]-ar[i-2]));
		}
		System.out.println(dp[n-1]);
    }
}