//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
	static long[] dp;
	static int n,k, a[];
	static long MOD = (long)1e9+7;
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		boolean[][] can = new boolean[n][n];
		
		for(int i =0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				can[i][j] = scn.nextInt()==1;
			}
		}
		
		long[] dp = new long[1<<n];
		
		dp[0] = 1;
		
//		for(int i=0;i<n;i++) {
			for(int mask = 0;mask<(1<<n)-1;mask++) {
				int i = num_set_bits(mask);
//				out.write((i+" ").getBytes());
//				out.flush();
				for(int j=0;j<n;j++) {
					if(can[i][j]&&(mask&(1<<j))==0) {
						int m2 = mask^(1<<j);
						dp[m2] = (dp[m2]+dp[mask])%MOD;
					}
				}
			}
//		}
		out.write((dp[(1<<n)-1]+"\n").getBytes());
		out.close();
	}
	static int num_set_bits(int mask) {
		int ans =0;
		while(mask>0) {
			if((mask&1)==1) {
				ans++;
			}
			mask=mask>>1;
		}
		return ans;
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
