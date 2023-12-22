
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
    static long[][] dp;
    static long max(int[]wts,int[]val,int ind,int cap)
    {
    	if(cap<0)
    		return -1000000000;
    	if(ind==val.length)
    		return 0;
    	if(dp[ind][cap]!=-1)
    		return dp[ind][cap];
    	dp[ind][cap]=Math.max(max(wts,val,ind+1,cap),(long)val[ind]+max(wts,val,ind+1,cap-wts[ind]));
    	return dp[ind][cap];
    }
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int[]ar=split();
        int n=ar[0];
        int w=ar[1];
        int[]wts=new int[n];
        int[]val=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar=split();
        	wts[i]=ar[0];
        	val[i]=ar[1];
        }
        dp=new long[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
        	Arrays.fill(dp[i],(long)-1);
        }
        System.out.println(max(wts,val,0,w));
    }
}