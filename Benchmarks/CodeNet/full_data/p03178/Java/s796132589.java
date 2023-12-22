/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
   static  long mod = 1000000007;
    static long dp[][][];
    static long ways(int pos , int rem , int pre , int d , String s)
    {
        if(pos == s.length())
        {
            if(rem==0)
            {
               
            return 1L;
            }
            
            return 0;
        }
        if(dp[pos][rem][pre] != -1)
        return dp[pos][rem][pre];
        
         long ans = 0;
    
         int curr = s.charAt(pos)-'0';
    
         for(int i = 0 ; i <= 9 ; i++)
         {
             if(i <= curr)
             {
                 if(i == curr && pre == 1)
                 ans += ways(pos+1,(rem+i)%d , 1, d , s);
                 
                 else
                 ans += ways(pos+1,(rem+i)%d ,0 , d , s);
             }
             
             else
             {
                 if(pre == 1)
                 break;
                 
                 ans += ways(pos+1,(rem+i)%d , 0 , d , s);
             }
             ans %= mod;
         }
         dp[pos][rem][pre] = ans;
         return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
		String s = sc.nextLine();
		int d = sc.nextInt();
		int n = s.length();
		dp = new long[n][d][2];
		for(int i = 0 ; i < n ; i++)
		{
		    for(int j = 0 ; j < d ; j++)
		    {
		        dp[i][j][0] = -1;
		        dp[i][j][1] = -1;
		    }
		}
		long ans = ways(0,0,1,d,s);
	     ans--;
	     System.out.println((ans+mod)%mod);
	}
}
