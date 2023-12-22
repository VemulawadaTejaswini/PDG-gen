import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		long[] x = new long[n];
		for(int i=0; i<n; i++) x[i] = sc.nextLong();
		long[] b = x.clone();
		Arrays.sort(x);
		long m1 = x[n/2-1];
		long m2 = x[n/2];
		PrintWriter pw = new PrintWriter(System.out);
		for(int i=0; i<n; i++) {
			if(b[i]<=m1) {
				pw.println(m2);
			} else {
				pw.println(m1);
			}
		}
		pw.close();
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
