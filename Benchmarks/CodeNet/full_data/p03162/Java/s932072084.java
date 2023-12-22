
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {

	public static int func(int a[] , int b[] , int c[] , int n)
	{
		int dp[][] = new int[n][3];
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		for(int i = 1; i < n; i++)
		{
			dp[i][0] = a[i] + Math.max(dp[i-1][1] , dp[i-1][2]);
			dp[i][1] = b[i] + Math.max(dp[i-1][0] , dp[i-1][2]);
			dp[i][2] = c[i] + Math.max(dp[i-1][1] , dp[i-1][0]);
		}
		return Math.max(dp[n-1][0] , Math.max(dp[n-1][1] , dp[n-1][2]));
	}

	public static void main(String[] args) throws Exception
	{
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	int b[] = new int[n];
    	int c[] = new int[n];
    	for(int i = 0 ; i < n ; i++)
    	{
    		a[i] = sc.nextInt();
    		b[i] = sc.nextInt();
    		c[i] = sc.nextInt();
    	}

    	System.out.println(func(a , b , c , n));
    }

}


