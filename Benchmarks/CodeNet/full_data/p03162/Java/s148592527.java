//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class dp_atcoder {
	static int n, in[][];
	static Integer[][] dp;
	public static void main(String[] args) {
		FastReader scn = new FastReader();
		
		n = scn.nextInt();
		
		in = new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				in[i][j] = scn.nextInt();
			}
		}
		
		dp = new Integer[n+1][5];
		
		int res = search(0,4);
		System.out.println(res);
	}
	public static int search(int d, int prev) {
		if(d>=n) {
			return 0;
		}
		if(dp[d][prev]!=null) {
			return dp[d][prev];
		}
		int ans = Integer.MIN_VALUE;
//		int mp = -1;
		for(int i =0;i<3;i++) {
			if(i!=prev) {
				int ta = search(d+1,i)+in[d][i];
				if(ta>ans) {
					ans= ta;
//					mp = i;
				}
			}
		}
//		System.out.println(in[d][mp]+" "+(d==0?-1:in[d-1][prev]));
		return dp[d][prev]=ans;
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
