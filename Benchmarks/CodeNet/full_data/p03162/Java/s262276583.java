
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {

	public static int func(int a[] , int b[] , int c[] , int n)
	{
		int dp[] = new int[n];
    	if(n == 1)
    		return Math.max(a[0] , Math.max(b[0] , c[0]));
    	int mx = Math.max(a[0] , Math.max(b[0] , c[0]));
    	dp[0] = mx;
    	for(int i = 1; i < n; i++)
    	{
    		if(a[i - 1] == b[i - 1] && b[i - 1] == c[i - 1])
    		{
    			dp[i] = dp[i - 1] + Math.max(a[i] , Math.max(b[i] , c[i]));
    			continue;
    		}
    		if(mx == a[i-1])
    		{
    			mx = Math.max(b[i] , c[i]);
    			dp[i] =  mx + dp[i-1];
    		}
    		else if(mx == b[i - 1])
    		{
    			mx = Math.max(a[i] , c[i]);
    			dp[i] = mx + dp[i-1];
    		}
    		else if(mx == c[i-1])
    		{
    			mx = Math.max(b[i] , a[i]);
    			dp[i] = mx + dp[i-1];
    		}
    		
    	}
    	
    	return dp[n-1];
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


