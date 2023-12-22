

import java.io.*;
import java.util.*;
public class test4 {
static long[][] memo;
static int N,W;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
	   N=sc.nextInt();
	   W=sc.nextInt();
	   w=new int[N];
	   v=new int[N];
	   for(int i=0;i<N;i++) {
		   w[i]=sc.nextInt();
		   v[i]=sc.nextInt();
	   }
	   memo=new long[N][W+1];
	   for(long[]a:memo)
		   Arrays.fill(a, -1);
	   dp(0,W);
	//   for(int[]a:memo)
		//   System.out.println(Arrays.toString(a));
	   System.out.println(memo[0][W]);
	}
	static int [] w,v;
	static long dp(int i,int remW) {
		if(remW<0)
			return -inf;
		if(N==i)
			return 0;
		if(memo[i][remW]!=-1)
			return memo[i][remW];
		long leave=dp(i+1,remW);
		long take=0;
	//	if(remW>w[i])
		 take=dp(i+1,remW-w[i])+v[i];
		//System.out.println(take);
		return memo[i][remW]=Math.max(take, leave);
	}
	static final long inf=(long) 1e17;
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