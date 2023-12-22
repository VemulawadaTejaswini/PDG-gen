import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
	static long mod=(long)1e9+7;
	static long[][][][]memo;
	static int n;
	static long dp(int i,int p1,int p2,int p3) {
		if(i==n)return 1l;
		if(memo[i][p1][p2][p3]!=-1)return memo[i][p1][p2][p3];
		if((p1==0 && p2==2) || (p1==2 && (p2==0 || p3==0)) || (p2==2 && p3==0)) {
			return memo[i][p1][p2][p3]=(dp(i+1,0,p1,p2)+dp(i+1,2,p1,p2)+dp(i+1,3,p1,p2))%mod;
		}
		if(p1==1 && p2==0) {
			return memo[i][p1][p2][p3]=(dp(i+1,0,p1,p2)+dp(i+1,1,p1,p2)+dp(i+1,3,p1,p2))%mod;
		}
		return memo[i][p1][p2][p3]=(dp(i+1,0,p1,p2)+dp(i+1,2,p1,p2)+dp(i+1,1,p1,p2)+dp(i+1,3,p1,p2))%mod;
	}
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		n=sc.nextInt();
		memo=new long[n][5][5][5];
		for(long[][][]i:memo) {
			for(long[][]j:i) {
				for(long[]o:j) {
					Arrays.fill(o, -1);
				}
			}
		}
		pw.println(dp(0,4,4,4));
		pw.flush();
 
	}
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
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