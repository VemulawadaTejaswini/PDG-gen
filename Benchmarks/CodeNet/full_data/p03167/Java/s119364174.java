

import java.io.*;
import java.util.*;
public class Main {
static long[][] memo;
static int H,W;
static char [][] grid;
static final long mod=1000000007;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
	   H=sc.nextInt();
	   W=sc.nextInt();
	   memo=new long[H][W];
	   for(long []a:memo)
		   Arrays.fill(a,-1);
	   grid=new char[H][W];
	   for(int i=0;i<H;i++)
		   grid[i]=sc.nextLine().toCharArray();
	   dp(0,0);
	   System.out.println(memo[0][0]);
	}
	static long dp(int i,int j) {
	if(i==H-1 && j==W-1)
		return 1;
	if(!valid(i,j))
		return 0;
	if(memo[i][j]!=-1)
		return memo[i][j];
	long down=dp(i+1,j)%mod;
	long right=dp(i,j+1)%mod;
	return memo[i][j]=(right+down)%mod;
	}
	static boolean valid(int i, int j) {
		return i>=0 && i<H && j>=0 && j<W && grid[i][j]=='.';
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