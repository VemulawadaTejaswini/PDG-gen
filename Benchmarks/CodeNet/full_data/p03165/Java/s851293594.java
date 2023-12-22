
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
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String t=br.readLine();
        int n=s.length();
        int m=t.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
        	for(int j=0;j<=m;j++)
        	{
        		if(i==0 || j==0)
        			continue;
        		if(s.charAt(i-1)==t.charAt(j-1))
        			dp[i][j]=1+dp[i-1][j-1];
        		else
        			dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        	}
        }
        String ans="";
        int i=n;
        int j=m;
        while(i>0 && j>0)
        {
        	if(s.charAt(i-1)==t.charAt(j-1))
        	{
        		ans=s.charAt(i-1)+ans;
        		i--;
        		j--;
        	}
        	else
        	{
        		if(dp[i-1][j]>dp[i][j-1])
        			i--;
        		else
        			j--;
        	}
        }
        System.out.println(ans);
    }
}