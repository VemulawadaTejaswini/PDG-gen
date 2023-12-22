/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static long dp[][];
    static long max(int pos , int sum , block arr[])
    {
       if(pos == arr.length || sum > 10000)
        return 0;
       
        if(dp[pos][sum] != -1)
        return dp[pos][sum];
        
        if(arr[pos].s >= sum)
        {
            dp[pos][sum] = Math.max(arr[pos].v+max(pos+1,sum+arr[pos].w,arr),max(pos+1,sum,arr));
        }
        
        else
        {
            dp[pos][sum] = max(pos+1,sum,arr);
        }
        return dp[pos][sum];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		block arr[] = new block[n];
		for(int i = 0 ; i < n ; i++)
		{
		    arr[i] = new block(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(arr,new Compare());
		dp = new long[n][10001];
		for(int i = 0 ; i < n ; i++)
		{
		    for(int j = 0 ; j <= 10000 ; j++)
		    {
		        dp[i][j] = -1;
		    }
		}
		System.out.println(max(0,0,arr));
	}
}

class block
{
    int w , s , v;
    public block(int w , int s , int v)
    {
        this.w = w;
        this.s = s;
        this.v = v;
    }
}

class Compare implements Comparator<block>
{
    public int compare(block a , block b)
    {
        return a.s+a.w-b.s-b.w;
    }
}
