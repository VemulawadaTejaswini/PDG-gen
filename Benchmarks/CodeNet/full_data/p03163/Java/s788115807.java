import java.io.*;
import java.util.*;
import java.math.*;
     
public class Main{
	public static void main(String[] args) throws Exception {
	IO io = new IO();
	PrintWriter out = new PrintWriter(System.out);
	Solver sr = new Solver();
	sr.solve(io,out);
	out.flush();
	out.close();
    	}

	static class Solver
	{
      	long[][] dp;
      	long[] val;
      	int[] wt;
      	long dfs(int i, int w, int n)
        {
          if(i==n || w==0)
            return 0;
          
          if(dp[i][w]!=-1)
            return dp[i][w];
          
          long max=0;
          if(wt[i]<=w)
            max =  Math.max(val[i]+dfs(i+1,w-wt[i],n), dfs(i+1,w,n));
          else
            max = dfs(i+1,w,n);
          
          return dp[i][w] = max;
        }
        void solve(IO io, PrintWriter out)
        {
            int t = 1;
            while(t-->0)
            {
                int n = io.nextInt();
              	int w = io.nextInt();
              	
              	dp = new long[n+1][w+1];
              	val = new long[n];
              	wt = new int[n];
              	for(int i=0 ; i<n ; i++)
                {
                  Arrays.fill(dp[i],-1);
                  wt[i] = io.nextInt();
                  val[i] = io.nextInt();
                }
              	Arrays.fill(dp[n],-1);
                out.print(dfs(0,w,n));
            }
	    }
	}
	//Special thanks to Petr (on codeforces) who inspired me to implement IO class!
	static class IO
	{
    	private static final int BUF_SIZE = 2048;
        BufferedReader br;
        private IO() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        private boolean isSpace(char c) {
            return c == '\n' || c == '\r' || c == ' ';
        }
        String next() {
            try {
                StringBuilder sb = new StringBuilder();
                int r;
                while ((r = br.read()) != -1 && isSpace((char) r));
                if (r == -1) {
                    return null;
                }
                sb.append((char) r);
                while ((r = br.read()) != -1 && !isSpace((char) r)) {
                    sb.append((char) r);
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
	}
}