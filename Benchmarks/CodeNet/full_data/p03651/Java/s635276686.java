import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	
	static int gcd(int a, int b) {
		if(a == 0) return b;
		return gcd(b % a, a);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();

		int x = sc.nextInt();
		
		int gcd = sc.nextInt();
		int max = gcd;
		
		for (int i = 1; i < n; i++) {
			int cur = sc.nextInt();
			gcd = gcd(cur, gcd);
			max = Math.max(max, cur);
		}
		
		if(x <= max && x % gcd == 0)
			out.println("POSSIBLE");
		else
			out.println("IMPOSSIBLE");
		
		out.flush();
	}


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
	}	

}