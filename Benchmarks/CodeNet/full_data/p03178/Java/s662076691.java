//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int d;
	static long MOD = (long)1e9+7;
//	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
//	static long[][] dp;
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		
		char[] k=scn.next().toCharArray();
		d = scn.nextInt();
		long[][] dp = new long[d][2];
		
		dp[0][0]= 1;
		
		for(int where =0;where<k.length;where++) {
			long[][] new_dp = new long[d][2];
			
			for(int sum=0;sum<d;sum++) {
				for(int sm_already=0;sm_already<2;sm_already++) {
					for(int digit =0;digit<10;digit++) {
						if(digit>k[where]-'0'&&sm_already==0) {
							break;
						}
						new_dp[(sum+digit)%d][(sm_already==1||(digit<k[where]-'0'))?1:0]=(new_dp[(sum+digit)%d][(sm_already==1||(digit<k[where]-'0'))?1:0]+dp[sum][sm_already])%MOD;
					}
				}
			}
			dp = new_dp;
		}
		long ans = (dp[0][0]+dp[0][1])%MOD;
		ans--;
		if(ans==-1) {
			ans = MOD-1;
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
