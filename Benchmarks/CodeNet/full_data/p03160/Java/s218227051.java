//package EducationalDPContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		int res=solve(a,n-1,dp);
		
		System.out.println(res);
	}
	
	
	//Recursion code with memoization;
	
	public static int solve(int a[], int i,int dp[])
	{
		if(i<=0)
		{
			//no items are left;
			return 0;
		}
		if(dp[i]!=-1)
		{
			return dp[i];
		}
		//taking next element
		int option1=Math.abs(a[i]-a[i-1])+solve(a,i-1,dp);
		int option2=Integer.MAX_VALUE;
		if(i>1)
		{
			//you can take two steps;
			option2=Math.abs(a[i]-a[i-2])+solve(a,i-2,dp);
		}
		return dp[i]=Math.min(option1,option2);
		
	}

}
