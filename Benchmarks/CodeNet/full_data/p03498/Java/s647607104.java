import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int mod = 1000000007;
	static int inf = (int) 1e16;
	static ArrayList<Integer>[] ad;
	static int n, m;
	static long[][] memo, c;
	static HashSet<Integer> h;
	static int[] ans;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		pair[] a = new pair[n];
		TreeSet<pair> ts = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			a[i] = new pair(i, sc.nextInt());
			// ts.add(new pair(a[i].to, a[i].number));
		}
		out.println(2 * n);
		for (int i = n - 1; i >= 0; i--) {
			pair[] b = new pair[n];
			for (int j = 0; j < n; j++)
				b[j] = new pair(a[j].to, a[j].number);
			Arrays.sort(b);
			out.println((b[i].to+1)+" "+(i+1));
			a[i].number=a[i].number+a[b[i].to].number;
			b = new pair[n];
			for (int j = 0; j < n; j++)
				b[j] = new pair(a[j].to, a[j].number);
			Arrays.sort(b);
			out.println((b[i].to+1)+" "+(i+1));
			a[i].number=a[i].number+a[b[i].to].number;
		}
		out.close();
	}

	static class pair implements Comparable<pair> {
		int to;
		int number;

		pair(int t, int n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
			if (number == o.number)
				return o.to - to;
			return o.number - number;
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
