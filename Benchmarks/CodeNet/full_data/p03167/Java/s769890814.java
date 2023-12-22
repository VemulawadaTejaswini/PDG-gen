/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
  char arr[][] ;
  long dp[][];
  long M = 1000000007;
  	
	public static void main (String[] args) throws java.lang.Exception
	{
      	FastReader s = new FastReader();
      	int m = s.nextInt();
      	int n = s.nextInt();
      	Main ob = new Main();
		ob.arr = new char[m][n];
      	ob.dp = new long[m][n];
		for(int i=0;i<m;i++){
          String st = s.next();
          for(int j = 0;j<n;j++)
            ob.arr[i][j] = st.charAt(j);
        }
      for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
          ob.dp[i][j]=-1;
		long ans = ob.getCount(m-1,n-1);
      	System.out.println(ans);
	}

  long getCount(int i, int j){
    if(dp[i][j]!=-1) return dp[i][j];
    if(i==0&&j==0) return 1;
    if(arr[i][j]=='#') return 0;
    long a = 0, b=0;
    if(i-1>=0)
     a=getCount(i-1,j);
    if(j-1>=0)
      b=getCount(i,j-1);
    dp[i][j] = (a%M+b%M)%M;
    return dp[i][j];
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
