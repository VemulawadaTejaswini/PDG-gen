/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
  	int dp[];
  	Main(int n){
      dp = new int[n];
      for(int i = 0; i < dp.length; i++) {
    dp[i] = -1;
}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
      	FastReader s = new FastReader();
		int  n = s.nextInt();
      	int k = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		arr[i]= s.nextInt();
		Main ob = new Main(n);
		k = Math.min(k,n-1);
		int ans = ob.getCost(n-1,arr,k);
		System.out.println(ans);
	}
  int getCost(int n,int arr[], int k){
    if(dp[n]!=-1) return dp[n];
  	if(n==0){
    dp[0]=0;
      return 0;
    }
    if(n==1){
      dp[1]= Math.abs(arr[1]-arr[0]);
      return dp[1];
    }
    int ans= 100001;
    for(int i = 1;i<=k;i++)
      ans = Math.min(ans,Math.abs(arr[n]-arr[n-i])+getCost(n-i,arr,Math.min(k,n-i)));
      dp[n] = ans;
    return dp[n];
  }


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
}
