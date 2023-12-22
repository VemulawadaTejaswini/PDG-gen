import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] ad;
	static int n, m, k;
	static long[][] memo;
	static seg[]a;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		n = sc.nextInt();
		a=new seg[n];
		memo=new long[n][10001];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			long v=sc.nextLong();
			a[i]=new seg(x, y, v);
		}
		Arrays.sort(a);
		for(long []y:memo)
			Arrays.fill(y, -1);
		System.out.println(dp(0,10000));
		out.flush();
	}
     static long dp(int i,int w) {
    	 if(i==n)
    		 return 0;
    	 if(memo[i][w]!=-1)
    		 return memo[i][w];
  //  	 System.out.println(i+" "+w);
    	 long ans=dp(i+1,w);
    	 if(a[i].a<=w)
    		 ans=Math.max(ans,a[i].v+dp(i+1,Math.min(w-a[i].a, a[i].b)));
    	 return memo[i][w]=ans;
     }
	static class seg implements Comparable<seg> {
		int a;
		int b;
		long v;

		seg(int s, int e, long vv) {
			a = s;
			b = e;
			v = vv;
		}

		public String toString() {
			return a + " " + b + " " + v;
		}

		public int compareTo(seg o) {
			return o.a + o.b - a - b;
		}
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

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}