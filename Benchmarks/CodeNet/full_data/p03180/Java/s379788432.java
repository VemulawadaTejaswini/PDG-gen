//package april2020;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main {
//	static long[] dp;
	static int n;
	static long MOD = (long)1e9+7;
	static long[] pre,dp;
//	static ArrayList<Integer>[] graph;
//	static HashSet<Integer> visited;
	static long[][] in;
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
		OutputStream out = new BufferedOutputStream ( System.out );
		n = scn.nextInt();
		in = new long[n][n];
		pre = new long[1<<n];
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				in[i][j] = scn.nextLong();
			}
		}
		for(int mask = 0; mask < (1 << n); ++mask) {
//			System.out.println("Here "+mask);
	        for(int i = 0; i < n; ++i) {
//	        	System.out.println("    Here "+i);
	            if((mask & (1 << i))>0) {
//	            	System.out.println("Here "+mask+" "+i);
	                for(int j = i + 1; j < n; ++j) {
	                    if((mask & (1 << j))>0) {
	                        pre[mask] += in[i][j];
//	                        System.out.println("Here "+i+" "+j);
	                    }
	                }
	            }
	        }
	    }
		dp = new long[1<<n];
		Arrays.fill(dp, Long.MIN_VALUE);
		dp[0]=0;
		for(int mask=0;mask<(1<<n);mask++) {
			ArrayList<Integer> not_taken = new ArrayList<>();
			for(int i=0;i<n;i++) {
				if((mask&(1<<i))==0) {
					not_taken.add(i);
				}
			}
			rec(0,not_taken, dp[mask], mask,0);
		}
		out.write((dp[(1<<n)-1]+"\n").getBytes());
		out.close();
	}
	static void rec(int i, ArrayList<Integer> not_taken, long score_so_far, int mask, int group) {
		if(i==(int)not_taken.size()) {
			dp[mask] = Math.max(dp[mask], score_so_far+pre[group]);
			return;
		}
		
		rec(i+1, not_taken, score_so_far, mask, group);
		rec(i+1, not_taken, score_so_far, mask^(1<<not_taken.get(i)),group^(1<<not_taken.get(i)));
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
