import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	static PrintWriter out=new PrintWriter(System.out);
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=sc.nextArr(n);
		long dp[]=new long[n];
		dp[1]=Math.abs(arr[0]-arr[1]);
		
		for(int i=2;i<n;i++) {
			long a=(long)Math.abs(arr[i-2]-arr[i])+dp[i-2];
			long b=(long)Math.abs(arr[i-1]-arr[i])+dp[i-1];
			if(a<b) {
				dp[i]=a;
			}else dp[i]=b;
		}
		out.println(dp[n-1]);
		out.close();
  }
	
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
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
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}
		public BigInteger BigInteger(String s) throws IOException{
			BigInteger a=new BigInteger(s);
			return a;
		}
	}
}