import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextDouble();
		double dp[][]=new double[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				dp[i][j]=-1.0;
		System.out.println(String.format("%.10f", rec(0,0,a,n,dp)));
		
	}

	private static double rec(int i, int h, double[] a, int n, double[][] dp) {
		
		if(i==n) {
			if(h>=(n+1)/2)
				return 1.0;
			else
				return 0.0;
		}
		if(dp[i][h]>-1) return dp[i][h];
		double op1=a[i]*rec(i+1, h+1, a, n, dp);
		double op2=(1-a[i])*rec(i+1, h, a, n, dp);
		
		
		return dp[i][h]=op1+op2;
		
	}
	
}