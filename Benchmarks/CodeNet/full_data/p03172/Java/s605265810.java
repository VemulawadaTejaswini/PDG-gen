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
		n = scn.nextInt();k = scn.nextInt();
		a = new int[n];
//		int sum=0;
		for(int i =0;i<n;i++) {
			a[i] = scn.nextInt();
//			sum+=a[i];
		}
		dp = new long[k+1];
		dp[0]=1;
		for(int child = 0;child<n;child++) {
			long[] fake = new long[k+1];
			
			for(int used =k;used>=0;used--) {
				long tmp = dp[used];
				int l = used+1;
				int r = used+ Math.min(a[child], k-used);
				if(l<=r) {
					fake[l]+=tmp;
					if(r+1<=k)
						fake[r+1]-=tmp;
				}
			}
			long ps = 0;
			for(int i=0;i<=k;i++) {
				ps+=(fake[i]%MOD);
				dp[i]+=(ps%MOD);
			}
		}
		out.write((dp[k]%MOD+"\n").getBytes());
		out.close();
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
