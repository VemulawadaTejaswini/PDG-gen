
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static long [][]dp;
	static int []w,v;
	static int n;
	public static long ans(int idx ,int rw) {
		if(rw<0)
			return -(int )1e9;
		if(idx==n)
			return 0;
		if(dp[idx][rw]!=-1)
			return dp[idx][rw];
		long take=v[idx]+ans(idx+1,rw-w[idx]);
		long leave=ans(idx+1,rw);
		if(take>leave)
		   return dp[idx][rw]=take;
		else 
		   return dp[idx][rw]=leave;
			
		
	}
	public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw =new PrintWriter(System.out);
        n=sc.nextInt();
        int rw=sc.nextInt();
        dp=new long[n][rw+1];
        v=new int[n];
        w=new int [n];
        for(long x[]:dp)
            Arrays.fill(x,(long) -1);
        for(int i=0;i<n;i++)
        {
          w[i]=sc.nextInt();
          v[i]=sc.nextInt();
        }
        
        pw.println(ans(0,rw));
        pw.flush();
		
		
	}
	
	static class Scanner {
		 
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}

}
