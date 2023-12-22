import java.util.*;
import java.io.*;
 
public class Main {
	public static long GCD(long a, long b) {
		if(b==0)return a;
		if(a==0)return b;
		return (a>b)?GCD(a%b, b):GCD(a, b%a);
	}
	public static long LCM(long a, long b) {
		return a*b/GCD(a, b);
	}
	public static long nCk(int n, int k) { //O(K)
		if (k > n) {
			return 0;		
		}
		long res = 1;
		for(int i = 1; i<=k; i++) {
			res = (n - k + i) * res/i;
		}
		return res;
	}
	public static long C(int a, int b, long[][] s) {
		int m = (int) 1e9 + 7;
		if (s[a][b] >= 0) {
			return s[a][b];
		} else if (a < b | a < 0 | b < 0) {
			s[a][b] = 0;
			return 0;
		} else if (a == b | b == 0) {
			s[a][b] = 1;
			return 1;
		} else {
			return s[a][b] = (C(a - 1, b, s) % m + C(a - 1, b - 1, s) % m) % m;
		}
 
	}
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String a=sc.next();
		StringBuilder s=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			s.append('x');
		}
		System.out.println(s);
		pw.close();
		
		
	}
 
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
			
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(FileReader r) {
			br = new BufferedReader(r);
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
	static class pair implements Comparable<pair>  {
		int x;
		int y;
		public pair(int x,int y) {
			this.x=x;
			this.y=y;
		}
		public String toString(){
			return x+" "+y;
		}
		public int compareTo(pair other) {
			if(this.x==other.x) {
				return this.y-other.y;
			}
			else {
				return this.x-other.x;
			}
		}
	}
 
}
