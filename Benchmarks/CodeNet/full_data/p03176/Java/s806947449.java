//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int n,k, h[],a[];
	static long MOD = (long)1e9+7;
//	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
//	static long[][] dp;
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		h = new int[n];
		a= new int[n];
		for(int i =0;i<n;i++) {
			h[i] = scn.nextInt();
		}
		for(int i =0;i<n;i++) {
			a[i] = scn.nextInt();
		}
		int base = 1;
		while(base<=n) {
			base*=2;
		}
		long[] tree = new long[2*base];
		long[] dp = new long[n+1];
//		for(int i =0;i<n;i++) {
//			dp[i] = a[i];
//		}
		for(int flower=0;flower<n;++flower) {
			
			int x = h[flower]+base;
			
			long best = 0;
			while(x>1) {
				if(x%2==1) {
					best = Math.max(best, tree[x-1]);
				}
				x/=2;
			}
			dp[h[flower]] = a[flower]+best;
			for(int i=base+h[flower];i>=1;i/=2) {
				tree[i] = Math.max(tree[i], dp[h[flower]]);
			}
//			for(int i=0;i<flower;i++) {
//				if(h[flower]>h[i]&&dp[i]+a[flower]>dp[flower]) {
//					dp[flower]=dp[i]+a[flower];
//				}
//			}
		}
		long ans= Long.MIN_VALUE;
		for(int i =0;i<=n;i++) {
			ans =Math.max(ans, dp[i]);
		}
		out.write((ans+"\n").getBytes());
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
