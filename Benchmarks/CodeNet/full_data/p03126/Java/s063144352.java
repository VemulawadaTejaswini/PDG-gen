import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter pw;
	static int n;

	static long gcd(long n, long m) {
		return (m == 0 ? n : gcd(m, n % m));
	}
	static int[] gcd2(int p, int q) {
	      if (q == 0)
	         return new int[] { p, 1, 0 };

	      int[] vals = gcd2(q, p % q);
	      int d = vals[0];
	      int a = vals[2];
	      int b = vals[1] - (p / q) * vals[2];
	      return new int[] { d, a, b };
	   }

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []count =new int[m+1];
		for(int i =0;i<n;i++){
			int k = sc.nextInt();
			while(k-->0){
				count[sc.nextInt()]++;
			}
		}
		int c=0;
		for(int i =1;i<=m;i++){
			if(count[i]==n)c++;
		}
		pw.println(c);
		pw.flush();
				}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
