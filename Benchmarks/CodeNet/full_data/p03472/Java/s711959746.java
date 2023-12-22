import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int inf = (int) 1e9;
	static long mod = 998244353;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n=sc.nextInt();
		long h=sc.nextLong();
		long [] a=new long[n];
		long [] b=new long[n];
		long maxa=0;
		for(int i=0;i<n;i++) {
			maxa=Math.max(a[i]=sc.nextInt(),maxa);
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long ans=0;
		long sum=0;
	    for(int i=n-1;i>=0;i--) {
	    	if(sum>=h) {
	    		System.out.println(ans);
	    		return;
	    	}
	    	sum+=Math.max(b[i], maxa);
	    	ans++;
	    }
	    if(sum>=h) {
    		System.out.println(ans);
    		return;
    	}
	    ans+=(h-sum)/maxa;
	    if((h-sum)%maxa!=0)
	    	ans++;
		out.println(ans);
		out.close();
	}
	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	static class unionfind {
		int[] p;
		int[] size;

		unionfind(int n) {
			p = new int[n];
			size = new int[n];

			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			Arrays.fill(size, 1);
		}

		int findSet(int v) {
			if (v == p[v])
				return v;
			return p[v] = findSet(p[v]);
		}

		boolean sameSet(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			return false;
		}

		int max() {
			int max = 0;
			for (int i = 0; i < size.length; i++)
				if (size[i] > max)
					max = size[i];
			return max;
		}

		void combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return;
			if (size[a] > size[b]) {
				p[b] = a;
				size[a] += size[b];

			} else {
				p[a] = b;
				size[b] += size[a];
			}
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

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}