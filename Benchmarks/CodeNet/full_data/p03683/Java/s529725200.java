import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static final int mod = (int)1e9 + 7;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int[] fac = new int[100001];
		fac[0] = 1;
		for(int i = 1; i <= 100000; ++i)
			fac[i] = (int)(1l * fac[i - 1] * i % mod);
		int N = sc.nextInt(), M = sc.nextInt();
		if(Math.abs(N - M) > 1)
			out.println(0);
		else
		{
			long ans = (int)(1l * fac[N] * fac[M] % mod);
			if(N == M)
				ans = ans * 2 % mod;
			out.println(ans);
 		}
		
		out.close();
	}
		
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public Scanner(String s) throws FileNotFoundException{	br = new BufferedReader(new FileReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException { return Double.parseDouble(next()); }

		public boolean ready() throws IOException {return br.ready();} 
	}
}