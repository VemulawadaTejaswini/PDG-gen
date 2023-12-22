/**
 * lcs
 */
import java.util.*;

import java.io.*;

 class lcs {
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
    // for refrence
    //this is the recursive solution of lcs comparing from starting
 /*   public static int lcss(String s,String t,int i,int j){
        if(i==s.length()||j==t.length())
        return 0;
        if(s.charAt(i)==t.charAt(j))
        {
            return 1+lcss(s,t,i+1,j+1);
        }
        else{
            return Math.max(lcss(s,t,i,j+1),lcss(s,t,i+1,j));
        }
    }*/
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        String s=sc.nextLine();
        String t=sc.nextLine();
       // System.out.println(lcss(s, t, 0,0));
       int n=s.length();
       int m=t.length();
        int dp[][]=new int[n+1][m+1];
        String res=new String();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
//////System.out.println(dp[n][m]);
        int i=n,j=m;
        while(i!=0&&j!=0){
            if(dp[i][j]==dp[i-1][j-1]+1&&dp[i-1][j]==dp[i][j-1]){
            res=s.charAt(i-1)+res;
            i--;
            j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            i=i-1;
            else if(dp[i][j-1]>dp[i-1][j])
            j=j-1;
            else i=i-1;
        }
        System.out.println(res);
    }
}