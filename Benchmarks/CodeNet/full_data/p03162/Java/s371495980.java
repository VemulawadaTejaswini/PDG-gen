
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main{
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}                                              
		return ans;
	} 
	static long mod=1000000007;
	static long power(long x,long y) 
    { 
        long res = 1; 
        x = x % mod; 
        while (y > 0) { 
            if (y % 2 == 1) 
                res = (res * x) % mod; 
            y = y >> 1;
            x = (x * x) % mod; 
        } 
        return res%mod; 
    } 
    static long modInverse(long n) 
    { 
        return power(n, mod-2); 
    } 
    static int digits(int n)
    {
    	int ans=0;
    	while(n!=0)
    	{
    		ans++;
    		n=n/10;
    	}
    	return ans;
    }
    static int[][] dp;
    static int max(int[][]arr,int ind,int prev)
    {
    	if(ind==arr.length)
    		return 0;
    	if(prev!=-1 && dp[ind][prev]!=-1)
    		return dp[ind][prev];
    	int res=-1000000000;
    	for(int i=0;i<3;i++)
    	{
    		if(i!=prev)
    			res=Math.max(res,arr[ind][i]+max(arr,ind+1,i));
    	}
    	if(prev!=-1)
    	dp[ind][prev]=res;
    	return res;
    }
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=cin();
        int[][]arr=new int[n][3];
        for(int i=0;i<n;i++)
        {
        	int[]ar=split();
        	arr[i][0]=ar[0];
        	arr[i][1]=ar[1];
        	arr[i][2]=ar[2];
        }
        dp=new int[n+1][3];
        for(int i=0;i<=n;i++)
        {
        	Arrays.fill(dp[i], -1);
        }
        System.out.println(max(arr,0,-1));
    }
}